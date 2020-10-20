package com.bonjourcs.java.spring.boot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liang Chenghao
 * Description: i18n endpoint
 * Date: 2020/10/19
 */
@RestController
public class I18NController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/i18n")
    public String getI18NInfo() {
        return messageSource.getMessage("message.greeting", null, LocaleContextHolder.getLocale());
    }


}
