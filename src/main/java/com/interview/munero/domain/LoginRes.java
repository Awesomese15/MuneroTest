package com.interview.munero.domain;

import java.util.List;

public class LoginRes {

    private String token;
    private String fullName;
    private String organization;
    private String expireDate;

    private List<String> privileges;
    private Configurations configurations;

    public LoginRes() {
    }


    public LoginRes(String token, String fullName, String organization, String expireDate, List<String> privileges, Configurations configurations) {
        this.token = token;
        this.fullName = fullName;
        this.organization = organization;
        this.expireDate = expireDate;
        this.privileges = privileges;
        this.configurations = configurations;
    }


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public List<String> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<String> privileges) {
        this.privileges = privileges;
    }

    public Configurations getConfigurations() {
        return configurations;
    }

    public void setConfigurations(Configurations configurations) {
        this.configurations = configurations;
    }
}
