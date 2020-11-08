package com.anoopkrdev.application;

import com.anoopkrdev.application.services.CloudServiceProvider;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application{
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CloudServiceProvider cloudServiceProvider = context.getBean("azureService", CloudServiceProvider.class);
        System.out.println("Cloud Provider Name: " + cloudServiceProvider.getServiceProviderName());
        System.out.println("Authentication Service: " + cloudServiceProvider.getAuthenticationService());
    }
}