package com.interview.munero.controller;

//import com.interview.munero.domain.JwtRes;
import com.interview.munero.domain.LoginReq;
import com.interview.munero.domain.User;
import com.interview.munero.service.MuneroService;
//import com.interview.munero.service.MyUserDetailsService;
//import com.interview.munero.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/munero")
public class MuneroController {

    MuneroService muneroService;
    AuthenticationManager authenticationManager;

//    MyUserDetailsService userDetailsService;
//
//    JwtUtil jwtTokenUtil;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
//    public MuneroController(MuneroService muneroService, AuthenticationManager authenticationManager, MyUserDetailsService userDetailsService, JwtUtil jwtTokenUtil) {
//        this.muneroService = muneroService;
//        this.authenticationManager = authenticationManager;
////        this.userDetailsService = userDetailsService;
////        this.jwtTokenUtil = jwtTokenUtil;
//    }

    public MuneroController(MuneroService muneroService, AuthenticationManager authenticationManager) {
        this.muneroService = muneroService;
        this.authenticationManager = authenticationManager;

    }




    //    public ResponseEntity<String> createUser(@RequestBody User user){
//
//    }

    @PostMapping("/create-user")
    public ResponseEntity<Integer> createUser(@RequestBody User user){
        int res = muneroService.createUser(user);

        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginReq req){

//        System.out.println("Hello");
//        try {
//            authenticationManager
//                    .authenticate(new UsernamePasswordAuthenticationToken(req.getusername(),req.getPass()));
//        } catch (BadCredentialsException e) {
//            throw new RuntimeException("Incorrect username or password", e);
//        }
//
//        final UserDetails userDetails = userDetailsService.loadUserByUsername(req.getusername());
//        final String jwtToken = jwtTokenUtil.generateToken(userDetails);

        HttpHeaders headers = new HttpHeaders();
        headers.add("X-GIFTLOV-DATE", "16012024113145");
        //headers.setBasicAuth(req.getusername(), req.getPassword());
        headers.setContentType(MediaType.APPLICATION_JSON);

        String jsonBody = String.format("{\"username\":\"%s\", \"password\":\"%s\"}", req.getusername(), req.getPassword());

        HttpEntity<String> requestEntity = new HttpEntity<>(jsonBody,headers);

        String url = "https://staging.giftlov.com/api/Base/generateToken";


        String jwtToken = restTemplate.postForObject(url,requestEntity, String.class);



      return ResponseEntity.ok(jwtToken);

    }
}
