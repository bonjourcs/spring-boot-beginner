package com.bonjourcs.java.spring.boot.web.exception;

import com.bonjourcs.java.spring.boot.web.model.RetObj;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.stream.Collectors;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2019/12/26
 */
@RestControllerAdvice
public class ValidationExceptionHandler {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public RetObj<String> handleValidationException(MethodArgumentNotValidException e) {

        BindingResult result = e.getBindingResult();
        if (result.hasErrors()) {
            String error = result.getAllErrors().stream().map(ObjectError::getDefaultMessage)
                    .collect(Collectors.joining("@"));
            RetObj<String> retObj = RetObj.fail("Bean validation failed.");
            retObj.setMsg(error);
            return retObj;
        }

        return RetObj.fail("Common exception.");
    }
}
