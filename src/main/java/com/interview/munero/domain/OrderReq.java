package com.interview.munero.domain;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class OrderReq {

    private String customerName;
    private String firstName;
    private String lastName;
    private String referenceNo;
    private String deliveryChannel;
    private String contactNumber;
    private String smsMobileNumber;
    private String emailAddress;
    private Map<String, String> additionalProperties;
    private String countryCode;
    private String languageCode;
    private String orderDate;
    private List<LineItem> lineItems;

    public OrderReq() {
    }

    public OrderReq(String customerName, String firstName, String lastName, String referenceNo, String deliveryChannel, String contactNumber, String smsMobileNumber, String emailAddress, Map<String, String> additionalProperties, String countryCode, String languageCode, String orderDate, List<LineItem> lineItems) {
        this.customerName = customerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.referenceNo = referenceNo;
        this.deliveryChannel = deliveryChannel;
        this.contactNumber = contactNumber;
        this.smsMobileNumber = smsMobileNumber;
        this.emailAddress = emailAddress;
        this.additionalProperties = additionalProperties;
        this.countryCode = countryCode;
        this.languageCode = languageCode;
        this.orderDate = orderDate;
        this.lineItems = lineItems;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public String getDeliveryChannel() {
        return deliveryChannel;
    }

    public void setDeliveryChannel(String deliveryChannel) {
        this.deliveryChannel = deliveryChannel;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getSmsMobileNumber() {
        return smsMobileNumber;
    }

    public void setSmsMobileNumber(String smsMobileNumber) {
        this.smsMobileNumber = smsMobileNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Map<String, String> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, String> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }
}
