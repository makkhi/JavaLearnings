package com.learn.spring.common;

public class HelloWorld {

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public void printName(){
        System.out.println("Hello World ! " + name);
    }
}
