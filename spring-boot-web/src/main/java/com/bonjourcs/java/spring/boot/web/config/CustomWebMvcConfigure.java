package com.bonjourcs.java.spring.boot.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/10/20
 */
@Configuration
public class CustomWebMvcConfigure implements WebMvcConfigurer {

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(customJsonConvert());
    }

    @Bean
    CustomJsonConvert customJsonConvert() {
        return new CustomJsonConvert();
    }

}
