package com.bonjourcs.java.spring.boot.web.model;

import lombok.Data;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2019/12/26
 */
@Data
public class RetObj<T> {

    /**
     * default success code and message
     */
    public static final String CODE_SUCCESS = "0000";
    public static final String MSG_SUCCESS = "SUCCESS";

    /**
     * default fail code and message
     */
    public static final String CODE_FAILED = "9999";
    public static final String MSG_FAILED = "FAIL";

    private String code;

    private String msg;

    private T data;

    private boolean success;

    public RetObj() {
    }

    public RetObj(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> RetObj<T> success(T data) {
        return new RetObj<>(CODE_SUCCESS, MSG_SUCCESS, data);
    }

    public static <T> RetObj<T> fail(T data) {
        return new RetObj<>(CODE_FAILED, MSG_FAILED, data);
    }

    public boolean isSuccess() {
        return CODE_SUCCESS.equals(this.code);
    }

}
