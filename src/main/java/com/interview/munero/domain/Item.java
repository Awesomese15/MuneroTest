package com.interview.munero.domain;

import java.util.List;
import java.util.Objects;

public class Item {

    private String id;
    private String name;
    private String usageInstructions;
    private String termsAndConditions;
    private String giftCardInformation;
    private String brand;
    private String currency;
    private Integer fromValue;
    private Integer toValue;
    private String cardFaceImage;
    private String cardFaceHash;
    private Integer productId;
    private  String discount;
    private String activationFees;
    private String fulfillmentFees;
    private String shippingFees;

    private String customizationFees;
    private String refundFees;
    private String otherFees;
    private String reconciliationCurrency;
    private String exchangeRate;
    private List<String> categories;
    private String countryCode;

    public Item() {
    }

    public Item(String id, String name, String usageInstructions, String termsAndConditions, String giftCardInformation, String brand, String currency, Integer fromValue, Integer toValue, String cardFaceImage, String cardFaceHash, Integer productId, String discount, String activationFees, String fulfillmentFees, String shippingFees, String customizationFees, String refundFees, String otherFees, String reconciliationCurrency, String exchangeRate, List<String> categories, String countryCode) {
        this.id = id;
        this.name = name;
        this.usageInstructions = usageInstructions;
        this.termsAndConditions = termsAndConditions;
        this.giftCardInformation = giftCardInformation;
        this.brand = brand;
        this.currency = currency;
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.cardFaceImage = cardFaceImage;
        this.cardFaceHash = cardFaceHash;
        this.productId = productId;
        this.discount = discount;
        this.activationFees = activationFees;
        this.fulfillmentFees = fulfillmentFees;
        this.shippingFees = shippingFees;
        this.customizationFees = customizationFees;
        this.refundFees = refundFees;
        this.otherFees = otherFees;
        this.reconciliationCurrency = reconciliationCurrency;
        this.exchangeRate = exchangeRate;
        this.categories = categories;
        this.countryCode = countryCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsageInstructions() {
        return usageInstructions;
    }

    public void setUsageInstructions(String usageInstructions) {
        this.usageInstructions = usageInstructions;
    }

    public String getTermsAndConditions() {
        return termsAndConditions;
    }

    public void setTermsAndConditions(String termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }

    public String getGiftCardInformation() {
        return giftCardInformation;
    }

    public void setGiftCardInformation(String giftCardInformation) {
        this.giftCardInformation = giftCardInformation;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getFromValue() {
        return fromValue;
    }

    public void setFromValue(Integer fromValue) {
        this.fromValue = fromValue;
    }

    public Integer getToValue() {
        return toValue;
    }

    public void setToValue(Integer toValue) {
        this.toValue = toValue;
    }

    public String getCardFaceImage() {
        return cardFaceImage;
    }

    public void setCardFaceImage(String cardFaceImage) {
        this.cardFaceImage = cardFaceImage;
    }

    public String getCardFaceHash() {
        return cardFaceHash;
    }

    public void setCardFaceHash(String cardFaceHash) {
        this.cardFaceHash = cardFaceHash;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getActivationFees() {
        return activationFees;
    }

    public void setActivationFees(String activationFees) {
        this.activationFees = activationFees;
    }

    public String getFulfillmentFees() {
        return fulfillmentFees;
    }

    public void setFulfillmentFees(String fulfillmentFees) {
        this.fulfillmentFees = fulfillmentFees;
    }

    public String getShippingFees() {
        return shippingFees;
    }

    public void setShippingFees(String shippingFees) {
        this.shippingFees = shippingFees;
    }

    public String getCustomizationFees() {
        return customizationFees;
    }

    public void setCustomizationFees(String customizationFees) {
        this.customizationFees = customizationFees;
    }

    public String getRefundFees() {
        return refundFees;
    }

    public void setRefundFees(String refundFees) {
        this.refundFees = refundFees;
    }

    public String getOtherFees() {
        return otherFees;
    }

    public void setOtherFees(String otherFees) {
        this.otherFees = otherFees;
    }

    public String getReconciliationCurrency() {
        return reconciliationCurrency;
    }

    public void setReconciliationCurrency(String reconciliationCurrency) {
        this.reconciliationCurrency = reconciliationCurrency;
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item item)) return false;
        return Objects.equals(getId(), item.getId()) && Objects.equals(getName(), item.getName()) && Objects.equals(getUsageInstructions(), item.getUsageInstructions()) && Objects.equals(getTermsAndConditions(), item.getTermsAndConditions()) && Objects.equals(getGiftCardInformation(), item.getGiftCardInformation()) && Objects.equals(getBrand(), item.getBrand()) && Objects.equals(getCurrency(), item.getCurrency()) && Objects.equals(getFromValue(), item.getFromValue()) && Objects.equals(getToValue(), item.getToValue()) && Objects.equals(getCardFaceImage(), item.getCardFaceImage()) && Objects.equals(getCardFaceHash(), item.getCardFaceHash()) && Objects.equals(getProductId(), item.getProductId()) && Objects.equals(getDiscount(), item.getDiscount()) && Objects.equals(getActivationFees(), item.getActivationFees()) && Objects.equals(getFulfillmentFees(), item.getFulfillmentFees()) && Objects.equals(getShippingFees(), item.getShippingFees()) && Objects.equals(getCustomizationFees(), item.getCustomizationFees()) && Objects.equals(getRefundFees(), item.getRefundFees()) && Objects.equals(getOtherFees(), item.getOtherFees()) && Objects.equals(getReconciliationCurrency(), item.getReconciliationCurrency()) && Objects.equals(getExchangeRate(), item.getExchangeRate()) && Objects.equals(getCategories(), item.getCategories()) && Objects.equals(getCountryCode(), item.getCountryCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getUsageInstructions(), getTermsAndConditions(), getGiftCardInformation(), getBrand(), getCurrency(), getFromValue(), getToValue(), getCardFaceImage(), getCardFaceHash(), getProductId(), getDiscount(), getActivationFees(), getFulfillmentFees(), getShippingFees(), getCustomizationFees(), getRefundFees(), getOtherFees(), getReconciliationCurrency(), getExchangeRate(), getCategories(), getCountryCode());
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", usageInstructions='" + usageInstructions + '\'' +
                ", termsAndConditions='" + termsAndConditions + '\'' +
                ", giftCardInformation='" + giftCardInformation + '\'' +
                ", brand='" + brand + '\'' +
                ", currency='" + currency + '\'' +
                ", fromValue=" + fromValue +
                ", toValue=" + toValue +
                ", cardFaceImage='" + cardFaceImage + '\'' +
                ", cardFaceHash='" + cardFaceHash + '\'' +
                ", productId=" + productId +
                ", discount='" + discount + '\'' +
                ", activationFees='" + activationFees + '\'' +
                ", fulfillmentFees='" + fulfillmentFees + '\'' +
                ", shippingFees='" + shippingFees + '\'' +
                ", customizationFees='" + customizationFees + '\'' +
                ", refundFees='" + refundFees + '\'' +
                ", otherFees='" + otherFees + '\'' +
                ", reconciliationCurrency='" + reconciliationCurrency + '\'' +
                ", exchangeRate='" + exchangeRate + '\'' +
                ", categories=" + categories +
                ", countryCode='" + countryCode + '\'' +
                '}';
    }
}
