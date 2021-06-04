package com.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LuBanAspect {

    @Pointcut("execution(* com.dao.*.*(..))")
    public void pointCut(){

    }
    @Before("pointCut()")
    public void befor(){
        System.out.println("------前置通知-----");
    }
}
