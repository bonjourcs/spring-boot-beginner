package com.bonjourcs.java.spring.boot.web.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/1/2
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Factory {

    private String location;

    private Crash crash;

}
