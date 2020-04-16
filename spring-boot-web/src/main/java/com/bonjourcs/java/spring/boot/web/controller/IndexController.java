package com.bonjourcs.java.spring.boot.web.controller;

import com.bonjourcs.java.spring.boot.web.config.bean.EnvProperties;
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

    @GetMapping("/index")
    @ApiOperation(value = "index controller")
    public String getIndex() {
        return "HELLO " + name + " " + envProperties.getName();
    }

}
