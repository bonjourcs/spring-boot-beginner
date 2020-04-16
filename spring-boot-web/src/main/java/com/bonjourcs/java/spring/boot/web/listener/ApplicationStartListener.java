package com.bonjourcs.java.spring.boot.web.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/4/7
 */
@Slf4j
public class ApplicationStartListener implements ApplicationListener<ApplicationStartingEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
        log.info("System is starting...");
    }

}
