package com.bonjourcs.java.spring.boot.web.service;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/10/21
 */
@Service
public class LocalCallService {

    private final RestTemplate restTemplate;

    public LocalCallService(RestTemplateBuilder restTemplateBuilder) {
        restTemplate = restTemplateBuilder.defaultHeader("X-REST-FROM", "LocalCallService")
                .build();
    }

    public String simpleGet(String url) {
        return restTemplate.getForObject(url, String.class);
    }
}
