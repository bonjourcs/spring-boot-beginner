package com.bonjourcs.java.spring.boot.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Liang Chenghao
 * Description: i18n endpoint
 * Date: 2020/10/19
 */
@RestController
@Slf4j
public class I18NController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/i18n")
    public String getI18NInfo(HttpServletRequest request) {
        log.info("from {}", request.getHeader("X-REST-FROM"));
        return messageSource.getMessage("message.greeting", null, LocaleContextHolder.getLocale());
    }


}
