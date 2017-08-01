package com.wanye.mapper;

import com.wanye.entity.User;
import com.wanye.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wanye on 2017/6/3.
 */
@Repository
@Mapper
public interface UserMapper {
    public User getUserById(int id);

    public List<User> getUserList();

    public UserInfo getUserInfo();
}
