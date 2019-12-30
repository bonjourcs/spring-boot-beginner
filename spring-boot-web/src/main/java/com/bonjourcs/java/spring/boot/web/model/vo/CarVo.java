package com.bonjourcs.java.spring.boot.web.model.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Liang Chenghao
 * Description: car vo
 * Date: 2019/12/27
 */
@Data
public class CarVo implements Serializable {

    private String id;

    private double price;

    private Date date;

}
