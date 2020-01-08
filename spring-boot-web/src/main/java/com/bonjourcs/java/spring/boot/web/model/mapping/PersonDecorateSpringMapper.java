package com.bonjourcs.java.spring.boot.web.model.mapping;

import com.bonjourcs.java.spring.boot.web.model.dto.PersonDto;
import com.bonjourcs.java.spring.boot.web.model.vo.PersonVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/1/8
 */
public abstract class PersonDecorateSpringMapper implements AnotherPersonSpringMapper {

    @Autowired
    @Qualifier("delegate")
    private AnotherPersonSpringMapper personMapper;

    @Override
    public PersonDto personVoToDto(PersonVo personVo) {
        PersonDto dto = personMapper.personVoToDto(personVo);
        dto.setPName("name:" + dto.getPName());
        return dto;
    }

}
