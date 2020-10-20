package com.bonjourcs.java.spring.boot.web.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/10/20
 */
@Component
@Slf4j
public class ValueService {

    public String getString() {
        log.info("capture value from value-service");
        return "hello";
    }

}
