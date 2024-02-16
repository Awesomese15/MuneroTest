//package com.interview.munero.service;
//
//import com.interview.munero.domain.User;
//import com.interview.munero.respository.MuneroRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import java.util.ArrayList;
//
//@Service
//public class MyUserDetailsService implements UserDetailsService {
//
//   MuneroRepo muneroRepo;
//
//    @Autowired
//    public MyUserDetailsService(MuneroRepo muneroRepo) {
//        this.muneroRepo = muneroRepo;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user= null;
//
//        user=muneroRepo.findByUsername(username);
//        System.out.println("user "+user);
//
//        return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPass(), new ArrayList<>());
//
//    }
//}
