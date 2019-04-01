package com.bonjourcs.java.spring.boot.web.http;

import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.ServletWebRequest;

import javax.servlet.http.HttpServletResponse;

/**
 * @author Liang Chenghao
 * Description: for http cache
 * Date: 2019/4/1
 */
@RestController
public class HttpCache {

    @RequestMapping("/caches/304")
    public ResponseEntity<String> httpVary(ServletWebRequest request, HttpServletResponse response) {

        // if the request is not out of age, return 304
        String eTag = request.getHeader("If-None-Match");
        if (!StringUtils.isEmpty(eTag)) {
            boolean valid = request.checkNotModified(eTag);
            if (valid) {
                return null;
            }
        }

        return ResponseEntity.ok()
                .eTag("60")
                .body("OK");
    }

}
