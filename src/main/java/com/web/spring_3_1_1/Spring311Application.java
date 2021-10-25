package com.web.spring_3_1_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.web.spring_3_1_1.repository")
@EnableTransactionManagement
@EntityScan(basePackages="com.web.spring_3_1_1.model")
public class Spring311Application {

    public static void main(String[] args) {
        SpringApplication.run(Spring311Application.class, args);
    }

}
