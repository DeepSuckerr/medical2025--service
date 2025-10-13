package com.wsj.medical2025;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@MapperScan("com.wsj.medical2025.mapper")
public class Medical2025Application {

    public static void main(String[] args) {
        SpringApplication.run(Medical2025Application.class, args);
    }

}
