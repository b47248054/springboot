package com.wanye.controller;

import com.wanye.entity.User;
import com.wanye.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by wanye on 2017/9/17.
 */
@RestController
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;
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

    @PostMapping("/user/save")
    public User saveUser(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            logger.info("验证失败：{}",bindingResult.getFieldError().getDefaultMessage());
            return null;
        }
        user = userService.saveUser(user);
        return user;
    }
}
