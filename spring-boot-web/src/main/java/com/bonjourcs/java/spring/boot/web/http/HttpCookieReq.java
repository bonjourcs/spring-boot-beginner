package com.bonjourcs.java.spring.boot.web.http;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Liang Chenghao
 * Description: cookie request object
 * Date: 2019/4/2
 */
@Data
public class HttpCookieReq implements Serializable {

    /**
     * set httpOnly
     */
    private boolean httpOnly;

    /**
     * set secure
     */
    private boolean secure;

    /**
     * set expire
     */
    private String expire;


}
