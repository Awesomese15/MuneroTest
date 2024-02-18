package com.interview.munero.domain;

public class OrderRes {
    private String id;
    private String referenceNo;

    public OrderRes() {
    }

    public OrderRes(String id, String referenceNo) {
        this.id = id;
        this.referenceNo = referenceNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }
}
