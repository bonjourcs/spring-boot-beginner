package com.bonjourcs.java.spring.boot.web.controller;

import com.bonjourcs.java.spring.boot.web.service.GlobalCallService;
import com.bonjourcs.java.spring.boot.web.service.LocalCallService;
import com.bonjourcs.java.spring.boot.web.service.RemoteCallService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/10/21
 */
@RestController
@Slf4j
public class RestTemplateController {

    private final RemoteCallService remoteCallService;

    private final LocalCallService localCallService;

    private final GlobalCallService globalCallService;

    @Autowired
    public RestTemplateController(RemoteCallService remoteCallService, LocalCallService localCallService,
                                  GlobalCallService globalCallService) {
        this.remoteCallService = remoteCallService;
        this.localCallService = localCallService;
        this.globalCallService = globalCallService;
    }

    @GetMapping("/rest/{method}")
    public String restGet(@PathVariable String method) {
        if ("remote".equals(method)) {
            return remoteCallService.simpleGet("http://localhost:18000/i18n");
        } else if ("local".equals(method)) {
            return localCallService.simpleGet("http://localhost:18000/i18n");
        } else {
            return globalCallService.simpleGet("http://localhost:18000/i18n");
        }
    }

}
