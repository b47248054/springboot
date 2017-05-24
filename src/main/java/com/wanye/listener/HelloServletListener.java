package com.wanye.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by wanye on 2017/5/24.
 */
@WebListener
public class HelloServletListener implements ServletContextListener{
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println(">>context listener init<<");
        //实现功能：系统启动时，加载请求参数配置”key”==”xiaoming”，并在过滤器中进行合法参数验证。
        servletContextEvent.getServletContext().setAttribute("key","xiaoming");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println(">>context listener destroyed<<");
    }
}
