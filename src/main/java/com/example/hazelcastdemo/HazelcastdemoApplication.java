package com.example.hazelcastdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class HazelcastdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HazelcastdemoApplication.class, args);
    }
}
