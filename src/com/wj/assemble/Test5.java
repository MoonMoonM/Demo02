package com.wj.assemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args){
        String xmlPath="beans5.xml";

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);

        System.out.println(applicationContext.getBean("user1"));
        System.out.println(applicationContext.getBean("user2"));
    }
}
