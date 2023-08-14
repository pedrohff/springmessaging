package com.spring.starter.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class Run {
    public static void main(String[] args) {
        SpringApplication.run(Run.class, args);
    }
}
