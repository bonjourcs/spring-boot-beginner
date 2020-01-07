package com.bonjourcs.java.spring.boot.web.model.mapping;

import com.bonjourcs.java.spring.boot.web.model.dto.CarDto;
import com.bonjourcs.java.spring.boot.web.model.vo.CarVo;
import org.junit.Test;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/1/7
 */
public class ReuseMapperTest {

    @Test
    public void testUpdateDto() {

        CarVo carVo = new CarVo();
        carVo.setId("1");

        CarDto dto = new CarDto();
        dto.setCarId("2");

        ReuseMapper.INSTANCE.updateDto(carVo, dto);
        System.out.println(dto);

    }
}
