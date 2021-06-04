package com.test;

import com.config.AppConfig;
import com.dao.IndexDao;
import com.dao.IndexDaoImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
        IndexDaoImpl dao= (IndexDaoImpl) ac.getBean("dao");
        dao.query();
        System.out.println("hello git");
        System.out.println("hello git2");
        System.out.println("hello git3");
        System.out.println("hello git4");
        System.out.println("master test");

        System.out.println("hot-fix test");
        System.out.println("push test");//ctrl+d快速复制一行
        System.out.println("push test");//

    }
}
