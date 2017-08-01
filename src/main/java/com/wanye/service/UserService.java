package com.wanye.service;

import com.wanye.entity.User;
import com.wanye.entity.UserInfo;
import com.wanye.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.soap.SOAPBinding;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by wanye on 2017/6/3.
 */
@Service
public class UserService {

    private Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UserMapper userMapper;

    public UserInfo getUserInfo() {
        return userMapper.getUserInfo();
    }
    public List<User> getUserList() {
//        return jdbcTemplate.query("select * from user", new RowMapper<User>() {
//
//            @Override
//            public User mapRow(ResultSet resultSet, int i) throws SQLException {
//                User user = new User();
//                user.setId(resultSet.getInt("id"));
//                user.setName(resultSet.getString("name"));
//                user.setAge(resultSet.getInt("age"));
//                user.setCreate(resultSet.getInt("create"));
//                return user;
//            }
//        });
        return getUserList0();
    }

    private List<User> getUserList0() {
        return userMapper.getUserList();
    }

    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }

    @Transactional
    public void copyUser(int id, String name) {
        User user = getUserById(id);
        int i = jdbcTemplate.update("insert INTO USER (name,age,`CREATE`) VALUES (?,?,?)", new Object[]{user.getName(), user.getAge(), user.getCreate()});
        logger.info("复制成功: i=" + i + " name=" + name + " id=" + id);
        i = jdbcTemplate.update("update USER SET name=? where id=?", new Object[]{name, user.getId()});
        logger.info("更新成功：i=" + i + " name=" + name + " id=" + id);
    }

}
