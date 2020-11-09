package com.anoopkrdev.springdemo.annotation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// This class inject dependency using field injection
@Component("gcpService")
public class GCPService implements CloudServiceProvider{

    @Autowired
    @Qualifier("openIDService")
    private AuthenticationService authenticationService;

    @Override
    public String getServiceProviderName() {
        return "GCP";
    }

    @Override
    public String getAuthenticationService() {
        return this.authenticationService.getAuthenticationService();
    }
}
