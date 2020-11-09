package com.anoopkrdev.springdemo.annotation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// This class inject dependency using setter injection
@Component("azureService")
public class AzureService implements CloudServiceProvider {

    private AuthenticationService authenticationService;

    @Autowired
    public void setAuthenticationService(@Qualifier("openIDService") AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    public String getServiceProviderName() {
        return "Azure";
    }

    public String getAuthenticationService() {
        return this.authenticationService.getAuthenticationService();
    }

}
