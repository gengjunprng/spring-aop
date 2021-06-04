package com.dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class IndexDaoImpl implements IndexDao{
    public void query() {
        System.out.println("dao------query");
    }
}
