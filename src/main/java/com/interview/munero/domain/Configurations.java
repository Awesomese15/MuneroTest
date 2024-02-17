package com.interview.munero.domain;

public class Configurations {
    private PlaceOrder placeOrder;

    public Configurations() {
    }

    public Configurations(PlaceOrder placeOrder) {
        this.placeOrder = placeOrder;
    }

    public PlaceOrder getPlaceOrder() {
        return placeOrder;
    }

    public void setPlaceOrder(PlaceOrder placeOrder) {
        this.placeOrder = placeOrder;
    }
}
