package com.anoopkrdev.springdemo.annotation.services;

import org.springframework.stereotype.Component;

@Component("samlService")
public class SAMLService implements AuthenticationService {
    public String getAuthenticationService() {
        return "SAML2";
    }
}
