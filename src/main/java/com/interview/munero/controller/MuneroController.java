package com.interview.munero.controller;

import com.interview.munero.domain.LoginReq;
import com.interview.munero.domain.User;
import com.interview.munero.service.MuneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/munero")
public class MuneroController {

    MuneroService muneroService;
    @Autowired
    public MuneroController(MuneroService muneroService) {
        this.muneroService = muneroService;
    }

    @PutMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginReq req){
        String res=muneroService.login(req);

        return new ResponseEntity<String>(res, HttpStatus.ACCEPTED);
    }
}
