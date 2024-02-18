package com.interview.munero.domain;

public class LineItem {

    private String cardItemId;
    private Integer value;

    public LineItem() {
    }

    public LineItem(String cardItemId, Integer value) {
        this.cardItemId = cardItemId;
        this.value = value;
    }

    public String getCardItemId() {
        return cardItemId;
    }

    public void setCardItemId(String cardItemId) {
        this.cardItemId = cardItemId;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
