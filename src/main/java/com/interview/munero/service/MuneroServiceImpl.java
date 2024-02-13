package com.interview.munero.service;

import com.interview.munero.domain.LoginReq;
import com.interview.munero.domain.User;
import com.interview.munero.respository.MuneroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MuneroServiceImpl implements MuneroService{

    MuneroRepo muneroRepo;

    @Autowired
    public MuneroServiceImpl(MuneroRepo muneroRepo) {
        this.muneroRepo = muneroRepo;
    }

    @Override
    public String login(LoginReq loginReq) {
        User user=muneroRepo.login(loginReq);

        if(user == null) return "User does not exist";

        if(!loginReq.getPass().equals(user.getPass())) return "Incorrect username/password";


        return user.getSecret();
    }
}
