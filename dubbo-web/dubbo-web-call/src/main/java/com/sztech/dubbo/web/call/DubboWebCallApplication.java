package com.sztech.dubbo.web.call;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sztech")
public class DubboWebCallApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboWebCallApplication.class, args);
    }

}
