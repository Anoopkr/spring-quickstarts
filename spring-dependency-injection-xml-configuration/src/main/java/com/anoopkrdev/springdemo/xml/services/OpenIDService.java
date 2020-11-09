package com.anoopkrdev.springdemo.xml.services;

public class OpenIDService implements AuthenticationService{
    public String getAuthenticationService() {
        return "OpenID Connect";
    }
}
