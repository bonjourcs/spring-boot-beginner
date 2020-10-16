package com.bonjourcs.java.spring.boot.web.controller;

import com.bonjourcs.java.spring.boot.web.config.bean.*;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2018/8/15
 */
@RestController
public class IndexController {

    @Value("${application.name}")
    private String name;

    @Autowired
    private EnvProperties envProperties;

    @Autowired
    private MyServer myServer;

    @Autowired
    private DurationProperties durationProperties;

    @Autowired
    private WeightProperties weightProperties;

    @GetMapping("/index")
    @ApiOperation(value = "index controller")
    public String getIndex() {
        return "HELLO " + name + " " + envProperties.getName()
                + " " + envProperties.getMaxLength()
                + " " + String.join("-", myServer.getServers());
    }

    @GetMapping("/properties/env")
    public EnvProperties getEnvProperties() {
        return envProperties;
    }

    @GetMapping("/properties/duration")
    public String getDuration() {
        return durationProperties.getCurrentLive().toString() + "-" + durationProperties.getTimeToLive().toString();
    }

    @GetMapping("/properties/weight")
    public Weight getWeight() {
        return weightProperties.getMaxWeight();
    }

}
