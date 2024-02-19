package com.interview.munero.domain;

import java.util.Objects;

public class LineItemStatus {

    private Integer lineNumber;
    private String cardItemId;
    private String value;
    private String status;
    private String statusDescription;
    private String claimURL;
    private String settlementCurrency;
    private String exchangeRate;
    private String settlementPrice;
    private String netPrice;

    public LineItemStatus() {
    }

    public LineItemStatus(Integer lineNumber, String cardItemId, String value, String status, String statusDescription, String claimURL, String settlementCurrency, String exchangeRate, String settlementPrice, String netPrice) {
        this.lineNumber = lineNumber;
        this.cardItemId = cardItemId;
        this.value = value;
        this.status = status;
        this.statusDescription = statusDescription;
        this.claimURL = claimURL;
        this.settlementCurrency = settlementCurrency;
        this.exchangeRate = exchangeRate;
        this.settlementPrice = settlementPrice;
        this.netPrice = netPrice;
    }

    public Integer getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getCardItemId() {
        return cardItemId;
    }

    public void setCardItemId(String cardItemId) {
        this.cardItemId = cardItemId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public String getClaimURL() {
        return claimURL;
    }

    public void setClaimURL(String claimURL) {
        this.claimURL = claimURL;
    }

    public String getSettlementCurrency() {
        return settlementCurrency;
    }

    public void setSettlementCurrency(String settlementCurrency) {
        this.settlementCurrency = settlementCurrency;
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getSettlementPrice() {
        return settlementPrice;
    }

    public void setSettlementPrice(String settlementPrice) {
        this.settlementPrice = settlementPrice;
    }

    public String getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(String netPrice) {
        this.netPrice = netPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LineItemStatus that)) return false;
        return Objects.equals(getLineNumber(), that.getLineNumber()) && Objects.equals(getCardItemId(), that.getCardItemId()) && Objects.equals(getValue(), that.getValue()) && Objects.equals(getStatus(), that.getStatus()) && Objects.equals(getStatusDescription(), that.getStatusDescription()) && Objects.equals(getClaimURL(), that.getClaimURL()) && Objects.equals(getSettlementCurrency(), that.getSettlementCurrency()) && Objects.equals(getExchangeRate(), that.getExchangeRate()) && Objects.equals(getSettlementPrice(), that.getSettlementPrice()) && Objects.equals(getNetPrice(), that.getNetPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLineNumber(), getCardItemId(), getValue(), getStatus(), getStatusDescription(), getClaimURL(), getSettlementCurrency(), getExchangeRate(), getSettlementPrice(), getNetPrice());
    }

    @Override
    public String toString() {
        return "LineItemStatus{" +
                "lineNumber=" + lineNumber +
                ", cardItemId='" + cardItemId + '\'' +
                ", value='" + value + '\'' +
                ", status='" + status + '\'' +
                ", statusDescription='" + statusDescription + '\'' +
                ", claimURL='" + claimURL + '\'' +
                ", settlementCurrency='" + settlementCurrency + '\'' +
                ", exchangeRate='" + exchangeRate + '\'' +
                ", settlementPrice='" + settlementPrice + '\'' +
                ", netPrice='" + netPrice + '\'' +
                '}';
    }
}
