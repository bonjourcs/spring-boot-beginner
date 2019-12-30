package com.bonjourcs.java.spring.boot.web.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Liang Chenghao
 * Description: car dto
 * Date: 2019/12/27
 */
@Data
public class CarDto implements Serializable {

    private String carId;

    private String price;

    private String date;

}
