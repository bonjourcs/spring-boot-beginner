package com.bonjourcs.java.spring.boot.web.model.mapping;

import org.mapstruct.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/1/2
 */
@Qualifier
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface V1Transfer {
}
