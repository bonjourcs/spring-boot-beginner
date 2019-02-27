package com.bonjourcs.java.spring.boot.security.bean.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Liang Chenghao
 * Description: 通用返回对象
 * Date: 2019/2/27
 */
@Data
public class RetObj<T> implements Serializable {

    public static String CODE_SUCCESS = "0000";

    public static String CODE_FAILED = "9999";

    /**
     * return code
     */
    private String retCode;

    /**
     * return message
     */
    private String retMessage;

    /**
     * success status
     */
    private boolean success;

    /**
     * payload
     */
    private T result;

    public boolean isSuccess() {
        return CODE_SUCCESS.equals(getRetCode());
    }

}
