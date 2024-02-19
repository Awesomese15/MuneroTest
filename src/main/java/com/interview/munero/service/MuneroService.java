package com.interview.munero.service;

import com.interview.munero.domain.*;

import java.util.List;

public interface MuneroService {

    String login(LoginReq loginReq);

    List<Item> getAllItems(int current, String lang, int rowCount, String includePricingDetails, String searchPhrase, String jwt, String methodType);

    OrderRes placeOrder(OrderReq order, String jwtToken, String methodType);

    OrderStatus getOrderService(String identifier, String jwt, String methodType);
}
