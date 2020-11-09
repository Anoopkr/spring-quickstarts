package com.anoopkrdev.springdemo.annotation.services;

import org.springframework.stereotype.Component;

@Component("openIDService")
public class OpenIDService implements AuthenticationService{
    public String getAuthenticationService() {
        return "OpenID Connect";
    }
}
