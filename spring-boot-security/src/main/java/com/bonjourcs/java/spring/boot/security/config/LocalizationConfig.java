package com.bonjourcs.java.spring.boot.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

/**
 * @author Liang Chenghao
 * Description: add localization support
 * Date: 2019/3/5
 */
@Configuration
public class LocalizationConfig {

    @Bean
    public ReloadableResourceBundleMessageSource getMessageSource() {

        ReloadableResourceBundleMessageSource source
                = new ReloadableResourceBundleMessageSource();
        source.addBasenames("classpath:org/springframework/security/messages");

        return source;
    }

}
