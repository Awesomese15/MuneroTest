package com.interview.munero.respository;


import com.interview.munero.domain.LoginReq;
import com.interview.munero.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MuneroRepo {

    JdbcTemplate jdbcTemplate;

    @Autowired
    public MuneroRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public User login(LoginReq req){
        String sql = "select id, username, pass, secret from login where username = ?";
        return  jdbcTemplate.queryForObject(sql , (rs,rowNu)->
                new User(rs.getLong("id"),
                        rs.getString("username"),
                        rs.getString("pass"),
                        rs.getString("secret")),req.getusername());


    }
}
