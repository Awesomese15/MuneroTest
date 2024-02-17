package com.interview.munero.domain;

public class PlaceOrder {
    private String referenceNo;

    public PlaceOrder() {
    }

    public PlaceOrder(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }
}
