package com.bonjourcs.java.spring.boot.web.config;

import org.apache.http.Header;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/10/21
 */
public class CustomRestTemplate implements RestTemplateCustomizer {

    @Override
    public void customize(RestTemplate restTemplate) {

        List<Header> headers = new ArrayList<>();
        headers.add(new BasicHeader("X-REST-FROM", "Global"));
        HttpClient httpClient = HttpClientBuilder.create()
                .setDefaultHeaders(headers)
                .build();

        restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory(httpClient));
    }

}
