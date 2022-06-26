package com.sparta.crudtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class CrudtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudtestApplication.class, args);
    }

}
