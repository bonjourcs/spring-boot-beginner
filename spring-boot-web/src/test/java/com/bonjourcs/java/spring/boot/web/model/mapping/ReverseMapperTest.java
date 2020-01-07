package com.bonjourcs.java.spring.boot.web.model.mapping;

import com.bonjourcs.java.spring.boot.web.model.dto.CarDto;
import com.bonjourcs.java.spring.boot.web.model.vo.CarVo;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/1/7
 */
public class ReverseMapperTest {

    @Test
    public void carVoToDto() {

        CarVo carVo = new CarVo();
        carVo.setId("1");

        CarDto carDto = ReverseMapper.INSTANCE.carVoToDto(carVo);
        Assert.assertEquals("1", carDto.getCarId());

    }

}
