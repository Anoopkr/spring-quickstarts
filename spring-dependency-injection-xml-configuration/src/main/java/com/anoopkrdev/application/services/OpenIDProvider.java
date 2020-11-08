package com.anoopkrdev.application.services;

public class OpenIDProvider implements AuthenticationService{
    public String getAuthenticationService() {
        return "OpenID Connect";
    }
}
