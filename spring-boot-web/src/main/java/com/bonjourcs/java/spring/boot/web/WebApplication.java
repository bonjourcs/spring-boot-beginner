package com.bonjourcs.java.spring.boot.web;

import com.bonjourcs.java.spring.boot.web.listener.ApplicationStartListener;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2018/8/15
 */
@SpringBootApplication
@EnableCaching
public class WebApplication {

    public static void main(String... args) {
        new SpringApplicationBuilder(WebApplication.class)
                .listeners(new ApplicationStartListener())
                .run(args);
    }

}
