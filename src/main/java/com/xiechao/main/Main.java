package com.xiechao.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String...args){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
    }
}
