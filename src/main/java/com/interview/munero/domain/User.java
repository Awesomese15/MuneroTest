package com.interview.munero.domain;
import java.util.Objects;


public class User {

    private Long id;
    private String username;
    private String pass;
    private String secret;

    public User(){

    }

    public User(Long id, String username, String secret) {
        this.id = id;
        this.username = username;
        this.secret = secret;
    }

    public User(Long id, String username, String pass, String secret) {
        this.id = id;
        this.username = username;
        this.pass = pass;
        this.secret = secret;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(getId(), user.getId()) && Objects.equals(getUsername(), user.getUsername()) && Objects.equals(getPass(), user.getPass()) && Objects.equals(getSecret(), user.getSecret());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUsername(), getPass(), getSecret());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", pass='" + pass + '\'' +
                ", secret='" + secret + '\'' +
                '}';
    }
}
