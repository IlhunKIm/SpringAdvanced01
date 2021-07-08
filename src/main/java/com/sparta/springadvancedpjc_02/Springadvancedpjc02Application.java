package com.sparta.springadvancedpjc_02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Springadvancedpjc02Application {

    public static void main(String[] args) {
        SpringApplication.run(Springadvancedpjc02Application.class, args);
    }

}
