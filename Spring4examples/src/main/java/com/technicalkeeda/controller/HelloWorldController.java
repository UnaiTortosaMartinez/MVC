package com.technicalkeeda.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldController {
 
    @SuppressWarnings("resource")
    public static void main(String[] args) {
 
        ApplicationContext contextObj = new ClassPathXmlApplicationContext("spring-beans.xml");
        ApplicationInitializer empObj = (ApplicationInitializer) contextObj.getBean("employeeBean");
        empObj.showResult();
    }
}
