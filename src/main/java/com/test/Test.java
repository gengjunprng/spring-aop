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
    }
}
