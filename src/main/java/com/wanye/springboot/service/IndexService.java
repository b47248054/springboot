package com.wanye.springboot.service;

import com.wanye.springboot.bean.ContentVo;
import com.wanye.springboot.bean.IndexVo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanye on 2017/5/15.
 */
@Service
public class IndexService {

    public IndexVo loadIndex() {
        IndexVo indexVo = new IndexVo();
        indexVo.setCode(200);
        indexVo.setSize(1000);
        indexVo.setTime(System.currentTimeMillis());
        indexVo.setStatus("SUCCESS");

        List<ContentVo> list = new ArrayList<ContentVo>();
        for (int i = 0; i < 10; i++) {
            ContentVo contentVo = new ContentVo();
            contentVo.setContent("wanye "+i);
            contentVo.setId(i);
            list.add(contentVo);
        }

        indexVo.setDatas(list);

        return indexVo;

    }
}
