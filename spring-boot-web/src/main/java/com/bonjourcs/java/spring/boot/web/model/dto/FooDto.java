package com.bonjourcs.java.spring.boot.web.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2019/12/31
 */
@Data
public class FooDto implements Serializable {

    private String orderNum;

    private int size;

}
