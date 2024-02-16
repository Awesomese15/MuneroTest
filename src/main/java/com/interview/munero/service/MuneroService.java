package com.interview.munero.service;

import com.interview.munero.domain.LoginReq;
import com.interview.munero.domain.User;

public interface MuneroService {

    String login(LoginReq loginReq);
    int createUser(User user);

    User findByUserName(String username);
}
