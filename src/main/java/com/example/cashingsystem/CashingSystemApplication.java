package com.example.cashingsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;


@MapperScan("com.example.cashingsystem.dao")
@SpringBootApplication
public class CashingSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(CashingSystemApplication.class, args);
    }

}
