package com.bonjourcs.java.spring.boot.web.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2019/12/27
 */
@Data
public class PersonDto implements Serializable {

    private String pName;

    private Integer pAge;

}
