package com.wanye.mapper;

import com.wanye.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by wanye on 2017/6/3.
 */
@Repository
@Mapper
public interface UserMapper {
    public User getUserById(int id);

    public int saveUser(User user);
}
