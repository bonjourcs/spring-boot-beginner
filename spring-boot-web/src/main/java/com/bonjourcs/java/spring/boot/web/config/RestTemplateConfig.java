package com.bonjourcs.java.spring.boot.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/10/21
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    public CustomRestTemplate customRestTemplate() {
        CustomRestTemplate customRestTemplate = new CustomRestTemplate();
        customRestTemplate.customize(restTemplate());
        return customRestTemplate;
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
