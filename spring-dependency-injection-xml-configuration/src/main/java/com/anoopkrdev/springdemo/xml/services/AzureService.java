package com.anoopkrdev.springdemo.xml.services;

public class AzureService implements CloudServiceProvider {

    private AuthenticationService authenticationService;
    private String region;

    public void setRegion(String region) {
        System.out.println("Region: " + region);
        this.region = region;
    }

    public void setAuthenticationService(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    public String getServiceProviderName() {
        return "Azure";
    }

    public String getAuthenticationService() {
        return this.authenticationService.getAuthenticationService();
    }

}
