package com.bonjourcs.java.spring.boot.security.filter;

import com.bonjourcs.java.spring.boot.security.bean.common.RetObj;
import com.bonjourcs.java.spring.boot.security.exception.TeapotException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Liang Chenghao
 * Description: global exception handler
 * Date: 2019/2/28
 */
@RestControllerAdvice
public class GlobalExceptionFilter {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public RetObj<String> globalException(HttpServletRequest request, Exception e) {

        RetObj<String> retObj = new RetObj<>();
        retObj.setRetCode(RetObj.CODE_FAILED);
        retObj.setRetMessage(request.getRequestURI() + " " + e.getMessage());

        return retObj;

    }

    @ExceptionHandler(TeapotException.class)
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    public RetObj<String> teapotException() {

        RetObj<String> retObj = new RetObj<>();

        retObj.setRetCode(RetObj.CODE_SUCCESS);
        retObj.setRetMessage("I am a teapot!");

        return retObj;

    }

}
