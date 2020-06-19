package com.wanye.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wanye on 2017/9/17.
 */
@Aspect
@Component
public class HttpAspect {
    private static final Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.wanye.controller.UserController..*(..))")
    public void log() {

    }

    @Before("log()")
    public void requestLog(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        logger.info("URL:{},Method:{},args:{}",request.getMethod() + " " + request.getRequestURL(),
                joinPoint.getSignature().getDeclaringTypeName(),joinPoint.getArgs());

    }

    @AfterReturning(returning = "object",pointcut = "log()")
    public void responseLog(Object object) {
        logger.info("response:{}",object.toString());
    }
}
