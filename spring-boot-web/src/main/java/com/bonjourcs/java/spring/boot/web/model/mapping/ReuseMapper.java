package com.bonjourcs.java.spring.boot.web.model.mapping;

import com.bonjourcs.java.spring.boot.web.model.dto.CarDto;
import com.bonjourcs.java.spring.boot.web.model.vo.CarVo;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/1/7
 */
@Mapper(nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface ReuseMapper {

    ReuseMapper INSTANCE = Mappers.getMapper(ReuseMapper.class);

    @Mapping(source = "id", target = "carId")
    @Mapping(target = "price", ignore = true)
    CarDto carVoToDto(CarVo carVo);

    @InheritConfiguration(name = "carVoToDto")
    void updateDto(CarVo carVo, @MappingTarget CarDto carDto);

}
