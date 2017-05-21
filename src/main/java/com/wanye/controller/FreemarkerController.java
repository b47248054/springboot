package com.wanye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * Created by wanye on 2017/5/20.
 */
@Controller
public class FreemarkerController {

    @RequestMapping("/ftl/home")
    public String home() {
        return "home";
    }

    @RequestMapping("/ftl/home1")
    public String home1(Model model) {
        model.addAttribute("time", new Date(System.currentTimeMillis()));
        return "home1";
    }

    @RequestMapping("/ftl/home2")
    public ModelAndView home2() {
        ModelAndView res = new ModelAndView("home1");
        res.addObject("time", new Date(System.currentTimeMillis()));
        return res;
    }
}
