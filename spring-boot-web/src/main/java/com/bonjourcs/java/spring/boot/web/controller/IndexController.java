package com.bonjourcs.java.spring.boot.web.controller;

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
    public String getIndex() {
        return "HELLO";
    }

}
