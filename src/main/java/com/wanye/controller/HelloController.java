package com.wanye.controller;

import com.wanye.entity.User;
import com.wanye.entity.UserInfo;
import com.wanye.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wanye on 2017/5/20.
 */
@RestController // @Controller + @ResponseBody
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public Map<String, String> hello(){
        Map<String, String> hello = new HashMap<String, String>();
        hello.put("data", "hello 小红");
        hello.put("status", "SUCCESS");
        return hello;
    }

    @RequestMapping("/userinfo")
    public UserInfo getUserInfo() {
        return userService.getUserInfo();
    }
    @RequestMapping("/userlist")
    public List<User> getUserList() {

        return userService.getUserList();
    }

    @RequestMapping("/user/{id}")
    public User getUser(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @RequestMapping("/user/cp/{id}/{name}")
    public List<User> cpUser(@PathVariable("id") int id, @PathVariable("name") String name) {
        userService.copyUser(id, name);
        return getUserList();
    }

}
