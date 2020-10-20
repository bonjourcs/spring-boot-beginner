package com.bonjourcs.java.spring.boot.web.config;

import org.springframework.boot.web.embedded.tomcat.TomcatContextCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/10/20t
 */
@Component
public class CustomWebContainer implements WebServerFactoryCustomizer<TomcatServletWebServerFactory> {

    @Override
    public void customize(TomcatServletWebServerFactory factory) {
        TomcatContextCustomizer contextCustomizer = context -> {
            context.setSessionCookieName("WEB-SESSION-1");
        };
        factory.addContextCustomizers(contextCustomizer);
    }

}
