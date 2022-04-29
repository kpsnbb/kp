package com.kp.j2eedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.kp.j2eedemo.dao")
@ComponentScan(basePackages = {"com.kp.j2eedemo.entity", "com.kp.j2eedemo.bll.impl","com.kp.j2eedemo.aspect"})
public class J2eedemoApplication {

        public static void main(String[] args) {

            SpringApplication.run(J2eedemoApplication.class, args);
    }

}
