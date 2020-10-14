package com.bonjourcs.java.spring.boot.web.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/10/14
 */
@Component
@Slf4j
public class ApplicationRunBean implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("application is running via runner");
    }
}
