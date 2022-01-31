package com.technicalkeeda.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AplicationconfigurerAdapter {
 
    @SuppressWarnings("resource")
    public static void main(String[] args) {
 
        ApplicationContext contextObj = new ClassPathXmlApplicationContext("spring-beans.xml");
        ApplicationInitializer empObj = (ApplicationInitializer) contextObj.getBean("employeeBean");
        empObj.showResult();
    }
}
