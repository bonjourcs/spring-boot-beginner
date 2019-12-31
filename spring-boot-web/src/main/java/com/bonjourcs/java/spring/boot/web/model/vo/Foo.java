package com.bonjourcs.java.spring.boot.web.model.vo;

import com.bonjourcs.java.spring.boot.web.constraint.OrderConstraint;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2019/12/26
 */
@Data
public class Foo implements Serializable {

    @NotBlank(message = "order number can't be blank")
    @OrderConstraint(pattern = "\\d{1,10}", message = "invalid order num")
    private String orderNum;

    private Integer size;

    private Date date;

}
