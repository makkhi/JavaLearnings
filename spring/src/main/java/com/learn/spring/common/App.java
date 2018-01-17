package com.learn.spring.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloBean");
        helloWorld.printName();
    }
}
