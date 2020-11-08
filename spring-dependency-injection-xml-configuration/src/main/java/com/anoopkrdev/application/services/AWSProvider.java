package com.anoopkrdev.application.services;

public class AWSProvider implements CloudServiceProvider {

    private AuthenticationService authenticationService;
    private String region;

    public void setRegion(String region) {
        System.out.println("Region: " + region);
        this.region = region;
    }

    AWSProvider(AuthenticationService authenticationService){
        this.authenticationService = authenticationService;
    }

    public String getServiceProviderName() {
        return "AWS";
    }

    public String getAuthenticationService() {
        return this.authenticationService.getAuthenticationService();
    }
}
