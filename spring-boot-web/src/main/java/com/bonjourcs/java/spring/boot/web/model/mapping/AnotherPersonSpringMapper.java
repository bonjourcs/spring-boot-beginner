package com.bonjourcs.java.spring.boot.web.model.mapping;

import com.bonjourcs.java.spring.boot.web.model.dto.CarDto;
import com.bonjourcs.java.spring.boot.web.model.dto.PersonDto;
import com.bonjourcs.java.spring.boot.web.model.vo.CarVo;
import com.bonjourcs.java.spring.boot.web.model.vo.PersonVo;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/1/8
 */
@Mapper(componentModel = "spring")
@DecoratedWith(PersonDecorateSpringMapper.class)
public interface AnotherPersonSpringMapper {

    @Mapping(source = "name", target = "PName")
    @Mapping(source = "age", target = "PAge")
    @Mapping(source = "carVo", target = "carDto")
    PersonDto personVoToDto(PersonVo personVo);

    @Mapping(source = "id", target = "carId")
    @Mapping(source = "price", target = "price", numberFormat = "$#0.0")
    @Mapping(source = "date", target = "date", dateFormat = "yyyyMMdd")
    CarDto carVoToDto(CarVo carVo);

}
