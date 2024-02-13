package com.interview.munero.domain;

import java.util.Objects;

public class LoginReq {

    private String username;
    private String pass;

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LoginReq loginReq)) return false;
        return Objects.equals(getusername(), loginReq.getusername()) && Objects.equals(getPass(), loginReq.getPass());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getusername(), getPass());
    }

    @Override
    public String toString() {
        return "LoginReq{" +
                "username='" + username + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
