package com.example.ioc2;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class Encoder {

    private IEncoder iEncoder;

    // Base64Encoder and UrlEncoder is both set as a component.
    // Spring does not know which type of encoder/component needs to be matched.
    // Thus, needs to have @Qualifier annotation
    // base74Encoder comes from the naming right next to the component.
    public Encoder(IEncoder iEncoder) {
        this.iEncoder = iEncoder;
    }

    public void setIEncoder(IEncoder iEncoder) {
        this.iEncoder = iEncoder;
    }

    public String encode(String message) {
        return iEncoder.encode(message);
    }
}

