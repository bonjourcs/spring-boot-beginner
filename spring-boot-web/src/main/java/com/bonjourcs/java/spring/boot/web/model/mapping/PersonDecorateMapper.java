package com.bonjourcs.java.spring.boot.web.model.mapping;

import com.bonjourcs.java.spring.boot.web.model.dto.PersonDto;
import com.bonjourcs.java.spring.boot.web.model.vo.PersonVo;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/1/8
 */
public abstract class PersonDecorateMapper implements AnotherPersonMapper {

    private final AnotherPersonMapper personMapper;

    public PersonDecorateMapper(AnotherPersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    @Override
    public PersonDto personVoToDto(PersonVo personVo) {
        PersonDto dto = personMapper.personVoToDto(personVo);
        dto.setPName("name:" + dto.getPName());
        return dto;
    }

}
