package com.bonjourcs.java.spring.boot.web.model.mapping;

import com.bonjourcs.java.spring.boot.web.config.WebApplication;
import com.bonjourcs.java.spring.boot.web.model.dto.PersonDto;
import com.bonjourcs.java.spring.boot.web.model.vo.PersonVo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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

        PersonDto dto = personMapper.personToDto(vo);
        Assert.assertEquals("Tom", dto.getPName());

    }
}
