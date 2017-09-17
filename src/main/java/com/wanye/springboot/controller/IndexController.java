package com.wanye.springboot.controller;

import com.wanye.springboot.bean.IndexVo;
import com.wanye.springboot.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wanye on 2017/5/15.
 */
@RestController
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping("/index")
    public IndexVo index(){
        IndexVo indexVo = indexService.loadIndex();
        return indexVo;
    }
}
