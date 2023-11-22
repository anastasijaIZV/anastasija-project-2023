package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.lp.domain")
@EnableJpaRepositories(basePackages = "com.lp.domain")
@ComponentScan(basePackages = {
        "com.lp.domain"
})

public class Project2023Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Project2023Demo1Application.class, args);
    }
    public void run(String... args) {

    }
}
