package com.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.app.mapper")
public class CarSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarSourceApplication.class, args);
    }

}
