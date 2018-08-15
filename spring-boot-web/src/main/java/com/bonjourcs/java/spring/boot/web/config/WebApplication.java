package com.bonjourcs.java.spring.boot.web.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2018/8/15
 */
@SpringBootApplication(scanBasePackages = {"com.bonjourcs.java.spring.boot.web"})
public class WebApplication {

    public static void main(String... args) {
        SpringApplication.run(WebApplication.class, args);
    }

}
