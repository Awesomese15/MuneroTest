package com.interview.munero.respository;


import com.interview.munero.domain.LoginReq;
import com.interview.munero.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MuneroRepo {

//    JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public MuneroRepo(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    public User login(LoginReq req){
//        String sql = "select id, username, pass, secret from login where username = ?";
//        return  jdbcTemplate.queryForObject(sql , (rs,rowNu)->
//                new User(rs.getLong("id"),
//                        rs.getString("username"),
//                        rs.getString("pass"),
//                        rs.getString("secret")),req.getusername());
//
//
//    }
//
//    public int save(User user) {
//        String sql ="insert into login (id, username, pass, secret) values (?,?,?,?)";
//       return jdbcTemplate.update(sql,user.getId(),user.getUsername(), user.getPass(), user.getSecret());
//
//    }
//
//
//    public User findByUsername(String username) {
//
//        String sql = "select id, username, pass, secret from login where username = ?";
//        return  jdbcTemplate.queryForObject(sql , (rs,rowNu)->
//                new User(rs.getLong("id"),
//                        rs.getString("username"),
//                        rs.getString("pass"),
//                        rs.getString("secret")),username);
//    }
//
//    public void deleteByUserName(String name){
//        String sql = "delete from login where username = ?";
//        jdbcTemplate.update(sql, name);
//    }
}
