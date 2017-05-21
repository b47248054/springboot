package com.wanye.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wanye on 2017/5/20.
 */
@RestController // @Controller + @ResponseBody
public class HelloController {

    @RequestMapping("/hello")
    public Map<String, String> hello(){
        Map<String, String> hello = new HashMap<String, String>();
        hello.put("data", "hello 小红");
        hello.put("status", "SUCCESS");
        return hello;
    }
}
