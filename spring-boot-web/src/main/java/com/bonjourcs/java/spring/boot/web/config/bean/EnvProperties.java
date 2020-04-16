package com.bonjourcs.java.spring.boot.web.config.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/4/10
 */
@Data
@Component
@ConfigurationProperties("env")
public class EnvProperties {

    private String name;

    private boolean require;

}
