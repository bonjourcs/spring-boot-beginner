package com.bonjourcs.java.spring.boot.web.http;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

/**
 * @author Liang Chenghao
 * Description: http cookie service
 * Date: 2019/4/2
 */
@Service
public class HttpCookieService {

    private final String GLOBAL_COOKIE_NAME = "_gc";

    public ResponseEntity<String> initCookie(HttpServletRequest request,
                                             HttpServletResponse response,
                                             HttpCookieReq req) {

        Cookie[] cookies = request.getCookies();
        boolean init;
        if (cookies != null && cookies.length > 0) {
            init =
                    Arrays.stream(cookies).noneMatch(c -> c.getName().equals(GLOBAL_COOKIE_NAME));
        } else {
            init = true;
        }

        if (init) {
            Cookie cookie = buildCookie(req);
            response.addCookie(cookie);
        }

        return ResponseEntity.ok("OK");

    }

    private Cookie buildCookie(HttpCookieReq req) {

        Cookie cookie = new Cookie(GLOBAL_COOKIE_NAME, System.currentTimeMillis() + "");

        if (req != null) {
            if (req.isHttpOnly()) {
                cookie.setHttpOnly(true);
            }
            if (req.isSecure()) {
                cookie.setSecure(true);
            }
        }
        return cookie;
    }
}
