package com.bonjourcs.java.spring.boot.security.controller;

import com.bonjourcs.java.spring.boot.security.exception.TeapotException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2019/3/6
 */
@RestController
public class TeapotController {

    @RequestMapping("/teapot")
    public void teapot() {
        throw new TeapotException();
    }

}
