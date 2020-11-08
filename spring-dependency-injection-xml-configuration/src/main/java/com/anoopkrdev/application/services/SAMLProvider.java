package com.anoopkrdev.application.services;

public class SAMLProvider implements AuthenticationService {
    public String getAuthenticationService() {
        return "SAML2";
    }
}
