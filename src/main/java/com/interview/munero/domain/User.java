package com.interview.munero.domain;
import java.util.Objects;


public class User {

    private Long id;
    private String usename;
    private String pass;
    private String secret;

    public User(){

    }

    public User(Long id, String usename, String pass, String secret) {
        this.id = id;
        this.usename = usename;
        this.pass = pass;
        this.secret = secret;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
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
        return Objects.equals(getId(), user.getId()) && Objects.equals(getUsename(), user.getUsename()) && Objects.equals(getPass(), user.getPass()) && Objects.equals(getSecret(), user.getSecret());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUsename(), getPass(), getSecret());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", usename='" + usename + '\'' +
                ", pass='" + pass + '\'' +
                ", secret='" + secret + '\'' +
                '}';
    }
}
