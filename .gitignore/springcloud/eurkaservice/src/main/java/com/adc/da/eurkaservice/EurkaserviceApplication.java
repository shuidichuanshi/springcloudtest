package com.adc.da.eurkaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurkaserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurkaserviceApplication.class, args);
    }
}
