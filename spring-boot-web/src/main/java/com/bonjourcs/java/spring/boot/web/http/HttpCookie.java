package com.bonjourcs.java.spring.boot.web.http;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Liang Chenghao
 * Description: for http cookie
 * Date: 2019/4/2
 */
@RestController
public class HttpCookie {

    @Autowired
    private HttpCookieService cookieService;

    @GetMapping("/http/cookies")
    public ResponseEntity<String> setCookie(HttpServletRequest request,
                                            HttpServletResponse response,
                                            HttpCookieReq req) {
        return cookieService.initCookie(request, response,req);
    }

}
