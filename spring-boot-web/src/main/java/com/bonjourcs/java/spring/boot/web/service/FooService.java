package com.bonjourcs.java.spring.boot.web.service;

import com.bonjourcs.java.spring.boot.web.config.bean.EnvProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/4/10
 */
@Service
@EnableConfigurationProperties(EnvProperties.class)
public class FooService {

}
