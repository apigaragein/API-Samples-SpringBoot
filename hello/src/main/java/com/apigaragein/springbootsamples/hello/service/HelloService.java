package com.apigaragein.springbootsamples.hello.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String hello(){
        return "Hello World";
    }
}
