package com.wanye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wanye on 2017/5/20.
 */
@Controller
public class JSPController {

    @RequestMapping("/jsp/home")
    public String home() {

        return "home";
    }
}
