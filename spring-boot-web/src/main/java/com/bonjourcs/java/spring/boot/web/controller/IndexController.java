package com.bonjourcs.java.spring.boot.web.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2018/8/15
 */
@RestController
public class IndexController {

    @GetMapping("/index")
    @ApiOperation(value = "index controller")
    public String getIndex() {
        return "HELLO";
    }

}
