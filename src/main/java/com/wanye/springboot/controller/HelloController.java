package com.wanye.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wanye on 2017/5/14.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public Map<String, String> hello(){
        Map<String, String> hello = new HashMap<String, String>();
        hello.put("data", "hello 对对对小红1");
        hello.put("status", "SUCCESS");
        return hello;
    }

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    @RequestMapping("/home1")
    public String home1(Model model) {
        model.addAttribute("time", new Date(System.currentTimeMillis()));
        return "home1";
    }

    @RequestMapping("/home2")
    public ModelAndView home2() {
        ModelAndView model = new ModelAndView("home1");
        model.addObject("time", new Date(System.currentTimeMillis()));
        return model;
    }
}
