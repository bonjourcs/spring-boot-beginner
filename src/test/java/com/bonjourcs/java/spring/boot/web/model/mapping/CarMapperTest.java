package com.bonjourcs.java.spring.boot.web.model.mapping;

import com.bonjourcs.java.spring.boot.web.model.dto.CarDto;
import com.bonjourcs.java.spring.boot.web.model.dto.PersonDto;
import com.bonjourcs.java.spring.boot.web.model.vo.CarVo;
import com.bonjourcs.java.spring.boot.web.model.vo.PersonVo;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2019/12/27
 */
public class CarMapperTest {

    @Test
    public void testCarMapper() {

        CarVo carVo = new CarVo();
        carVo.setId("1");
        carVo.setPrice(12.00);

        CarDto dto = CarMapper.CAR_MAPPER.carVoToDto(carVo);
        Assert.assertEquals("1", dto.getCarId());
        Assert.assertEquals("$12.00", dto.getPrice());


    }
}
