package com.bonjourcs.java.spring.boot.web.model.mapping;

import com.bonjourcs.java.spring.boot.web.config.WebApplication;
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
 * Date: 2019/12/27
 */
@SpringBootTest(classes = WebApplication.class)
@RunWith(SpringRunner.class)
public class PersonMapperTest {

    @Autowired
    private PersonMapper personMapper;

    @Test
    public void testCdiMapper() {

        PersonVo vo = new PersonVo();
        vo.setAge(19);
        vo.setName("Tom");

        CarVo carVo = new CarVo();
        carVo.setPrice(12.00);
        carVo.setId("12");
        carVo.setDate(new Date(System.currentTimeMillis()));
        vo.setCarVo(carVo);

        PersonDto dto = personMapper.personToDto(vo);
        Assert.assertEquals("Tom", dto.getPName());
        Assert.assertEquals("12", dto.getCarDto().getCarId());

    }
}
