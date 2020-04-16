package com.bonjourcs.java.spring.boot.web.model.mapping;

import com.bonjourcs.java.spring.boot.web.WebApplication;
import com.bonjourcs.java.spring.boot.web.model.dto.PersonDto;
import com.bonjourcs.java.spring.boot.web.model.vo.CarVo;
import com.bonjourcs.java.spring.boot.web.model.vo.PersonVo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/1/8
 */
@SpringBootTest(classes = WebApplication.class)
@RunWith(SpringRunner.class)
public class AnotherPersonSpringMapperTest {

    @Autowired
    AnotherPersonSpringMapper personSpringMapper;

    @Test
    public void personVoToDto() {

        PersonVo personVo = new PersonVo();
        personVo.setName("Tom");
        personVo.setAge(10);

        CarVo carVo = new CarVo();
        carVo.setId("1");
        carVo.setDate(new Date(System.currentTimeMillis()));
        carVo.setPrice(100.25);
        personVo.setCarVo(carVo);

        PersonDto personDto = personSpringMapper.personVoToDto(personVo);
        Assert.assertEquals("name:Tom", personDto.getPName());
    }
}
