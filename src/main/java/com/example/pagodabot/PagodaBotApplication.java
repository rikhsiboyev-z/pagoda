package com.example.pagodabot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PagodaBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(PagodaBotApplication.class, args);
    }

}
