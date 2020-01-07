package com.bonjourcs.java.spring.boot.web.model.mapping;

import com.bonjourcs.java.spring.boot.web.model.dto.CarDto;
import com.bonjourcs.java.spring.boot.web.model.vo.CarVo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/1/7
 */
@Mapper
public interface ReverseMapper {

    ReverseMapper INSTANCE = Mappers.getMapper(ReverseMapper.class);

    @Mapping(source = "id", target = "carId")
    @Mapping(target = "date", dateFormat = "yyyy-MM-dd")
    CarDto carVoToDto(CarVo carVo);

    @InheritInverseConfiguration
    CarVo carDtoToVo(CarDto carDto);

}
