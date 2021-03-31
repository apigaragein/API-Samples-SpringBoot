package com.apigaragein.springbootsamples.configsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.apigaragein.springbootsamples.configsample")
public class ConfigSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigSampleApplication.class, args);
	}

}
