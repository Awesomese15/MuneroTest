package com.interview.munero.domain;

import java.util.Objects;

public class LoginReq {

    private String username;
    private String password;

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LoginReq loginReq)) return false;
        return Objects.equals(getusername(), loginReq.getusername()) && Objects.equals(getPassword(), loginReq.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getusername(), getPassword());
    }

    @Override
    public String toString() {
        return "LoginReq{" +
                "username='" + username + '\'' +
                ", pass='" + password + '\'' +
                '}';
    }
}
