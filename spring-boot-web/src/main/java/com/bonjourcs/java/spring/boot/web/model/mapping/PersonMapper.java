package com.bonjourcs.java.spring.boot.web.model.mapping;

import com.bonjourcs.java.spring.boot.web.model.dto.PersonDto;
import com.bonjourcs.java.spring.boot.web.model.vo.PersonVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2019/12/27
 */
@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(source = "name", target = "PName")
    @Mapping(source = "age", target = "PAge")
    PersonDto personToDto(PersonVo personVo);

}
