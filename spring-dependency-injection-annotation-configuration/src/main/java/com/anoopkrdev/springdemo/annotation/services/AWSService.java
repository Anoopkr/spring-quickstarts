package com.anoopkrdev.springdemo.annotation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// This class inject dependency using constructor injection
@Component("awsService")
public class AWSService implements CloudServiceProvider {

    private AuthenticationService authenticationService;

    @Autowired
    public AWSService(@Qualifier("samlService") AuthenticationService authenticationService){
        this.authenticationService = authenticationService;
    }

    public String getServiceProviderName() {
        return "AWS";
    }

    public String getAuthenticationService() {
        return this.authenticationService.getAuthenticationService();
    }
}
