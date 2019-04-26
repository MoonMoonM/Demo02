package com.wj.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args){
        String xmlPath="beans2.xml";

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        System.out.println(applicationContext.getBean("bean2"));
    }
}
