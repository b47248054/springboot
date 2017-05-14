package com.wanye.springboot.bean;

import java.util.List;

/**
 * Created by wanye on 2017/5/14.
 */
public class IndexVo {
    private String status;
    private int code;
    private List<ContentVo> datas;
    private long time;
    private int size;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<ContentVo> getDatas() {
        return datas;
    }

    public void setDatas(List<ContentVo> datas) {
        this.datas = datas;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
