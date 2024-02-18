package com.interview.munero.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.interview.munero.domain.*;
import com.interview.munero.respository.MuneroRepo;
import org.apache.commons.codec.digest.HmacUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.lang.reflect.Field;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Service
public class MuneroServiceImpl implements MuneroService{

    MuneroRepo muneroRepo;
    RestTemplate restTemplate;

    String dateTime = "";

    private final String secret ="coding_challenge_1";

    @Autowired
    public MuneroServiceImpl(MuneroRepo muneroRepo, RestTemplate restTemplate) {
        this.muneroRepo = muneroRepo;
        this.restTemplate = restTemplate;
    }




    private HttpHeaders createHeaders(String token, String signature){
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", token);
        headers.add("signature", signature);
        headers.add("X-GIFTLOV-DATE", dateTime);

        headers.setContentType(MediaType.APPLICATION_JSON);

        return headers;
    }
    @Override
    public String login(LoginReq req) {
        HttpHeaders headers = new HttpHeaders();
        dateTime = getCurrentUTCTime();
        headers.add("X-GIFTLOV-DATE", dateTime);
        headers.setContentType(MediaType.APPLICATION_JSON);

        String jsonBody = String.format("{\"username\":\"%s\", \"password\":\"%s\"}", req.getusername(), req.getPassword());

        HttpEntity<String> requestEntity = new HttpEntity<>(jsonBody,headers);

        String url = "https://staging.giftlov.com/api/Base/generateToken";


        LoginRes res = restTemplate.postForObject(url,requestEntity, LoginRes.class);

        return res.getToken();
    }

    private String getLastWord(String url){
        String regexPattern = "/Base/([^/]+)";

        Pattern pattern = Pattern.compile(regexPattern);

        Matcher matcher = pattern.matcher(url);
        String lastWord = "";
        if (matcher.find()) {
            lastWord = matcher.group(1);
        }
        return lastWord;
    }

    @Override
    public List<Item> getAllItems(int current, String lang, int rowCount, String includePricingDetails, String searchPhrase, String jwt, String methodType) {

        String url = "https://staging.giftlov.com/api/Base/items";
        // Define a regex pattern to match the word after "Base/"
        String lastWord=getLastWord(url);

        List<String> params = new ArrayList<>();
        params.add(String.valueOf(current));
        params.add(lang);
        params.add(String.valueOf(rowCount));
        if(includePricingDetails != null && includePricingDetails.equals(""))
            params.add(includePricingDetails);

        if(searchPhrase != null && searchPhrase != "")
            params.add(searchPhrase);

        Collections.sort(params);

        String plainSign = lastWord+methodType
                +params.stream().collect(Collectors.joining())
                +dateTime
                +jwt.substring("Bearer ".length());

        System.out.println(plainSign);

        String signature = hmacWithApacheCommons(plainSign,secret);

        System.out.println("new hmac "+signature);

        HttpHeaders headers = createHeaders(jwt.substring("Bearer ".length()),signature);

        HttpEntity<String> requestEntity = new HttpEntity<>(headers);

        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url)
                .queryParam("current", current)
                .queryParam("rowCount", rowCount)
                .queryParam("lang", lang);


        if(includePricingDetails != null && includePricingDetails.equals(""))
            builder.queryParam("includePricingDetails", includePricingDetails);

        if(searchPhrase != null && searchPhrase.equals(""))
            builder.queryParam("searchPhrase", searchPhrase);


        System.out.println(builder.toUriString());

        Object res= restTemplate.exchange(builder.toUriString(),HttpMethod.GET,requestEntity, Object.class).getBody();
        ObjectMapper objectMapper = new ObjectMapper();
        LinkedHashMap<String, Object> map= objectMapper.convertValue(res,LinkedHashMap.class);
        System.out.println(res);
        ItemListWrapper itemListWrapper = new ItemListWrapper();
        map.keySet().forEach(key->{
            if(key.equals("items"))
                itemListWrapper.setItemList((List<Item>) map.get(key));
            if(key.equals("total"))
                itemListWrapper.setTotal((Integer) map.get(key));
            if(key.equals("rowCount"))
                itemListWrapper.setRowCount((Integer) map.get(key));
            if(key.equals("current"))
                itemListWrapper.setCurrent((Integer) map.get(key));
        });




        return itemListWrapper.getItemList();
       // return res.getItemList();

    }

   /* private List<String> getValuesInString(Object obj){
        List<String> valuesList = new ArrayList<>();
        Class<?> orderReqClass = OrderReq.class;
        for (java.lang.reflect.Field field : orderReqClass.getDeclaredFields()) {
            try {
                field.setAccessible(true);
                Object value = field.get(obj);
                if (value != null) {
                    if(field.getName().equals("lineItems")){
                        Object val = field.get();
                    }else{
                        valuesList.add(value.toString());
                    }


                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            }
        }

        return valuesList;
    }*/




    @Override
    public OrderRes placeOrder(OrderReq order, String jwtToken, String methodType) {

        String url = "https://staging.giftlov.com/api/Base/placeOrder";
        String lastWord=getLastWord(url);




       List<String> params=new ArrayList<>();

        StringBuilder concatenatedString = new StringBuilder();

        // Using reflection to dynamically access fields in OrderReq
        Class<?> orderReqClass = OrderReq.class;
        for (Field field : orderReqClass.getDeclaredFields()) {
            try {
                field.setAccessible(true);
                Object value = field.get(order);

                // Check if the value is not null and handle lineItems separately
                if (value != null) {
                    if (field.getName().equals("lineItems")) {
                        // Handle lineItems separately
                        List<LineItem> lineItems = (List<LineItem>) value;
                        for (LineItem item : lineItems) {
//                            concatenatedString.append(concatenateLineItem(item));
                            params.add(item.getCardItemId());
                            params.add(String.valueOf(item.getValue()));
                        }
                    }else if(field.getName().equals("additionalParameters")){
                        Map<String,String> additionalProp = order.getAdditionalProperties();
                        additionalProp
                                .keySet()
                                .forEach(key-> params.add((additionalProp.get(key))));
                    }

                    else {
                        //concatenatedString.append(value.toString()).append(" ");
                        params.add(value.toString());
                    }
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }


        Collections.sort(params);


        String plainSign = lastWord+methodType
                +params.stream().collect(Collectors.joining())
                +dateTime
                +jwtToken.substring("Bearer ".length());
        //plainSign = plainSign.replaceAll("\\s","");

        System.out.println("plainSign "+plainSign);
        System.out.println(dateTime);

        String signature = hmacWithApacheCommons(plainSign,secret);

        HttpHeaders headers = createHeaders(jwtToken.substring("Bearer ".length()),signature);

        HttpEntity<?> requestEntity = new HttpEntity<>(order,headers);

        Object res=restTemplate.postForObject(url,requestEntity, Object.class);

        ObjectMapper objectMapper = new ObjectMapper();
        LinkedHashMap<String, Object> map= objectMapper.convertValue(res,LinkedHashMap.class);
        System.out.println(res);
        OrderRes orderRes = new OrderRes();
        map.keySet().forEach(key->{
            if(key.equals("id"))
                orderRes.setId( map.get(key).toString());
            if(key.equals("referenceNo"))
                orderRes.setReferenceNo(map.get(key).toString());
        });



        return orderRes ;
    }

    public String getCurrentUTCTime() {

        Instant instant = Instant.now();

        ZoneId utcZone = ZoneId.of("UTC");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss").withZone(utcZone);
        String formattedUTC = formatter.format(instant);

        return formattedUTC;
    }


    public static String hmacWithApacheCommons( String plainSign, String secret) {
        String hmac = new HmacUtils("HmacSHA512", secret).hmacHex(plainSign);
        System.out.println("hmac "+ hmac);
        return hmac;
    }




//    @Override
//    public User findByUserName(String username) {
//        return  muneroRepo.findByUsername(username);
//    }







}
