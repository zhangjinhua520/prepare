package com.zjh.prepare;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.zjh.prepare.mapper")
@SpringBootApplication
public class PrepareApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrepareApplication.class, args);
    }
}
