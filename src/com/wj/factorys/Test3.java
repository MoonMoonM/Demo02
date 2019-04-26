package com.wj.factorys;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args){
        String xmlPath="beans3.xml";

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(applicationContext.getBean("bean3"));
    }
}
