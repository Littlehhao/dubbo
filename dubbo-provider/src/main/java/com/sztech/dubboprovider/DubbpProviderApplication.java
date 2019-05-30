package com.sztech.dubboprovider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableDubboConfiguration
@SpringBootApplication
@ComponentScan(basePackages = "com.sztech")
public class DubbpProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubbpProviderApplication.class, args);
    }

}
