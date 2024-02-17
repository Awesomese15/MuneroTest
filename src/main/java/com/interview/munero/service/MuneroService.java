package com.interview.munero.service;

import com.interview.munero.domain.Item;
import com.interview.munero.domain.LoginReq;

import java.util.List;

public interface MuneroService {

    String login(LoginReq loginReq);

    List<Item> getAllItems(int current, String lang, int rowCount, String includePricingDetails, String searchPhrase, String jwt, String methodType);

}
