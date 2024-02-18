package com.interview.munero.controller;

//import com.interview.munero.domain.JwtRes;
import com.interview.munero.domain.*;
import com.interview.munero.service.MuneroService;
//import com.interview.munero.service.MyUserDetailsService;
//import com.interview.munero.util.JwtUtil;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/munero")
public class MuneroController {

    MuneroService muneroService;
    RestTemplate restTemplate;

    @Autowired
    public MuneroController(MuneroService muneroService, RestTemplate restTemplate) {
        this.muneroService = muneroService;
        this.restTemplate = restTemplate;
    }








    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginReq req){

        String jwtToken=muneroService.login(req);

        return ResponseEntity.ok(jwtToken);

    }


    @GetMapping("/items")
    public ResponseEntity<?> getAllItems(   @RequestParam int current,
                                            @RequestParam String lang,
                                            @RequestParam int rowCount,
                                            @RequestParam(required = false) String includePricingDetails,
                                            @RequestParam(required = false) String searchPhrase,
                                            @RequestHeader("Authorization") String jwtToken,
                                            HttpServletRequest request ){

        String methodType = request.getMethod();
       List<Item> items =muneroService.getAllItems(current,lang,rowCount,includePricingDetails, searchPhrase,jwtToken,methodType);

       return new ResponseEntity<>(items, HttpStatus.OK);

    }


    @PostMapping("/place-order")
    public ResponseEntity<?>placeOrder(@RequestBody OrderReq order,
                                       @RequestHeader("Authorization") String jwtToken,
                                       HttpServletRequest request ){

        String methodType = request.getMethod();
        OrderRes res=muneroService.placeOrder(order, jwtToken,methodType);

        return new ResponseEntity<>(res, HttpStatus.OK);

    }



}
