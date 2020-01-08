package com.bonjourcs.java.spring.boot.web.model.mapping;

import com.bonjourcs.java.spring.boot.web.model.dto.PersonDto;
import com.bonjourcs.java.spring.boot.web.model.vo.CarVo;
import com.bonjourcs.java.spring.boot.web.model.vo.PersonVo;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/1/8
 */
public class AnotherPersonMapperTest {

    @Test
    public void testPersonVoToDto() {

        PersonVo personVo = new PersonVo();
        personVo.setName("Tom");
        personVo.setAge(10);

        CarVo carVo = new CarVo();
        carVo.setId("1");
        carVo.setDate(new Date(System.currentTimeMillis()));
        carVo.setPrice(100.25);
        personVo.setCarVo(carVo);

        PersonDto personDto = AnotherPersonMapper.INSTANCE.personVoToDto(personVo);
        Assert.assertEquals("name:Tom", personDto.getPName());

    }
}
