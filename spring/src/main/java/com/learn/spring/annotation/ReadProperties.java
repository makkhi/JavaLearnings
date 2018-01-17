package com.learn.spring.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.learn.spring.annotation.*"})
public class ReadProperties {


    @Value("{message}")
    private String message;
}
