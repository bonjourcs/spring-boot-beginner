package com.bonjourcs.java.spring.boot.web.model.mapping;

import com.bonjourcs.java.spring.boot.web.model.dto.CarDto;
import com.bonjourcs.java.spring.boot.web.model.dto.PersonDto;
import com.bonjourcs.java.spring.boot.web.model.vo.CarVo;
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
    @Mapping(source = "carVo.id", target = "carDto.carId")
    @Mapping(source = "carVo.price", target = "carDto.price", numberFormat = "$#.00")
    @Mapping(source = "carVo.date", target = "carDto.date", dateFormat = "yyyy-MM-dd")
    PersonDto personToDto(PersonVo personVo);

    @Mapping(source = "id", target = "carId")
    @Mapping(source = "price", target = "price", numberFormat = "$#.00")
    @Mapping(source = "date", target = "date", dateFormat = "yyyy-MM-dd")
    CarDto carToDto(CarVo carVo);

}
