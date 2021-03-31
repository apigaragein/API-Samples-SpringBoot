package com.apigaragein.springbootsamples.configsample.controller;

import com.apigaragein.springbootsamples.configsample.service.ConfigSampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigSampleController {

    @Autowired
    ConfigSampleService configSampleService;

    @GetMapping("/hello")
    public String hello() {
        return configSampleService.hello();
    }

}
