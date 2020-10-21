package com.bonjourcs.java.spring.boot.web.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/10/21
 */
@Service
public class GlobalCallService {

    private final RestTemplate restTemplate;

    public GlobalCallService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String simpleGet(String url) {
        return restTemplate.getForObject(url, String.class);
    }

}
