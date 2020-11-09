package com.anoopkrdev.springdemo.annotation;

import com.anoopkrdev.springdemo.annotation.services.CloudServiceProvider;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application{

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CloudServiceProvider cloudServiceProvider = context.getBean("gcpService", CloudServiceProvider.class);
        System.out.println("Field based dependency injection");
        System.out.println("Cloud Provider Name: " + cloudServiceProvider.getServiceProviderName());
        System.out.println("Authentication Service: " + cloudServiceProvider.getAuthenticationService());

        cloudServiceProvider = context.getBean("awsService", CloudServiceProvider.class);
        System.out.println("Constructor based dependency injection");
        System.out.println("Cloud Provider Name: " + cloudServiceProvider.getServiceProviderName());
        System.out.println("Authentication Service: " + cloudServiceProvider.getAuthenticationService());

        cloudServiceProvider = context.getBean("azureService", CloudServiceProvider.class);
        System.out.println("Setter based dependency injection");
        System.out.println("Cloud Provider Name: " + cloudServiceProvider.getServiceProviderName());
        System.out.println("Authentication Service: " + cloudServiceProvider.getAuthenticationService());

        context.close();
    }
}