package com.why;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 该注解表示程序的启动入口
@SpringBootApplication
public class DemoApplication {

    /**
     * SpringBoot项目是通过main方法启动的
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class);
    }
}
