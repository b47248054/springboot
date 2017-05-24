package com.wanye.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by wanye on 2017/5/24.
 */
@WebFilter
public class HelloFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(">>filter init<<");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 实现功能：过滤所有请求，判断请求参数中是否包含”key”，
        // 同时”key”==“xiaohong”，如不包含，则认为是非法请求，返回“param error”，如合法则继续访问。
        System.out.println(">>filter doFilter<<");
        String key = servletRequest.getParameter("key");
        String _key = (String) servletRequest.getServletContext().getAttribute("key");
        if (null != key && _key.equals(key)) {
            System.out.println(">>filter match<<");
            filterChain.doFilter(servletRequest, servletResponse);
        }else {
            System.out.println(">>filter param error<<");
            PrintWriter out = servletResponse.getWriter();
            out.print("param error");
            out.close();
        }
    }

    @Override
    public void destroy() {
        System.out.println(">>filter destroy<<");
    }
}
