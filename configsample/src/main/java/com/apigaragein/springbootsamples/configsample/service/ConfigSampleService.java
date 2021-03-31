package com.apigaragein.springbootsamples.configsample.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ConfigSampleService {
    @Value("${greeting.message}")
    String message;

    @Value("${greeting.name:Sriram}")
    String name;

    @Value("${greeting.suffix}")
   String suffix;

    public String hello(){
        return message + " " + name + suffix;
    }
}
