package com.bonjourcs.java.spring.boot.web.config.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/10/14
 */
@Component
@ConfigurationProperties("my")
public class MyServer {

    private List<String> servers = new ArrayList<>();

    public List<String> getServers() {
        return servers;
    }

}
