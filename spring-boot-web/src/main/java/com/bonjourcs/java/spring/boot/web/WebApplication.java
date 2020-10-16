package com.bonjourcs.java.spring.boot.web;

import com.bonjourcs.java.spring.boot.web.listener.ApplicationStartListener;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2018/8/15
 */
@SpringBootApplication
public class WebApplication {

    @Bean
    public ExitCodeGenerator exit() {
        return () -> 100;
    }

    public static void main(String... args) {
        new SpringApplicationBuilder(WebApplication.class)
                .listeners(new ApplicationStartListener())
                .run(args);
    }

}
