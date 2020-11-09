package com.anoopkrdev.springdemo.xml.services;

public class SAMLService implements AuthenticationService {
    public String getAuthenticationService() {
        return "SAML2";
    }
}
