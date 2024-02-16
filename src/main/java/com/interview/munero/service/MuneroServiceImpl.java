package com.interview.munero.service;

import com.interview.munero.domain.LoginReq;
import com.interview.munero.domain.User;
import com.interview.munero.respository.MuneroRepo;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MuneroServiceImpl implements MuneroService{

    MuneroRepo muneroRepo;
    PasswordEncoder passwordEncoder;

    @Autowired
    public MuneroServiceImpl(MuneroRepo muneroRepo, PasswordEncoder passwordEncoder) {
        this.muneroRepo = muneroRepo;
        this.passwordEncoder = passwordEncoder;
    }

    @PostConstruct
    public void insertUser(){

        String userName = "coding_challenge_1";
        User newUser = new User(1L,"coding_challenge_1",  "coding_challenge_1");
        newUser.setPass(passwordEncoder.encode("coding_challenge_1"));

        try{
            muneroRepo.findByUsername(userName);
            muneroRepo.deleteByUserName(userName);
            muneroRepo.save(newUser);
        }catch (EmptyResultDataAccessException ex){
            muneroRepo.save(newUser);
        }

    }




    public int createUser(User user){
        String encodedPassword = passwordEncoder.encode(user.getPass());

        user.setPass(encodedPassword);
        return  muneroRepo.save(user);
    }



    @Override
    public String login(LoginReq loginReq) {
        User user=muneroRepo.login(loginReq);

        if(user == null) return "User does not exist";

        if(!loginReq.getPassword().equals(user.getPass())) return "Incorrect username/password";


        return user.getSecret();
    }


    @Override
    public User findByUserName(String username) {
        return  muneroRepo.findByUsername(username);
    }


}
