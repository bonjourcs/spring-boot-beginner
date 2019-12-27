package com.bonjourcs.java.spring.boot.web.model.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2019/12/27
 */
@Data
public class PersonVo implements Serializable {

    private String name;

    private Integer age;

}
