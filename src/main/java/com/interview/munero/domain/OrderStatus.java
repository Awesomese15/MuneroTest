package com.interview.munero.domain;

import java.util.List;
import java.util.Objects;

public class OrderStatus {

    private String id;
    private String customerName;
    private String deliveryChannel;
    private String emailAddress;
    private String smsMobileNumber;
    private String referenceNo;
    private String creationDate;
    private String placementDate;
    private List<LineItemStatus> lineItems;

    public OrderStatus() {
    }

    public OrderStatus(String id, String customerName, String deliveryChannel, String emailAddress, String smsMobileNumber, String referenceNo, String creationDate, String placementDate, List<LineItemStatus> lineItems) {
        this.id = id;
        this.customerName = customerName;
        this.deliveryChannel = deliveryChannel;
        this.emailAddress = emailAddress;
        this.smsMobileNumber = smsMobileNumber;
        this.referenceNo = referenceNo;
        this.creationDate = creationDate;
        this.placementDate = placementDate;
        this.lineItems = lineItems;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDeliveryChannel() {
        return deliveryChannel;
    }

    public void setDeliveryChannel(String deliveryChannel) {
        this.deliveryChannel = deliveryChannel;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getSmsMobileNumber() {
        return smsMobileNumber;
    }

    public void setSmsMobileNumber(String smsMobileNumber) {
        this.smsMobileNumber = smsMobileNumber;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getPlacementDate() {
        return placementDate;
    }

    public void setPlacementDate(String placementDate) {
        this.placementDate = placementDate;
    }

    public List<LineItemStatus> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItemStatus> lineItems) {
        this.lineItems = lineItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderStatus that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getCustomerName(), that.getCustomerName()) && Objects.equals(getDeliveryChannel(), that.getDeliveryChannel()) && Objects.equals(getEmailAddress(), that.getEmailAddress()) && Objects.equals(getSmsMobileNumber(), that.getSmsMobileNumber()) && Objects.equals(getReferenceNo(), that.getReferenceNo()) && Objects.equals(getCreationDate(), that.getCreationDate()) && Objects.equals(getPlacementDate(), that.getPlacementDate()) && Objects.equals(getLineItems(), that.getLineItems());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCustomerName(), getDeliveryChannel(), getEmailAddress(), getSmsMobileNumber(), getReferenceNo(), getCreationDate(), getPlacementDate(), getLineItems());
    }

    @Override
    public String toString() {
        return "OrderStatus{" +
                "id='" + id + '\'' +
                ", customerName='" + customerName + '\'' +
                ", deliveryChannel='" + deliveryChannel + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", smsMobileNumber='" + smsMobileNumber + '\'' +
                ", referenceNo='" + referenceNo + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", placementDate='" + placementDate + '\'' +
                ", lineItems=" + lineItems +
                '}';
    }
}

