package com.bonjourcs.java.spring.boot.web.model.mapping;

import com.bonjourcs.java.spring.boot.web.model.dto.CarDto;
import com.bonjourcs.java.spring.boot.web.model.vo.CarVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2019/12/27
 */
@Mapper
public interface CarMapper {

    CarMapper CAR_MAPPER = Mappers.getMapper(CarMapper.class);

    /**
     * convert car vo to car dto
     *
     * @param carVo car vo
     * @return converted car dto
     */
    @Mapping(source = "id", target = "carId")
    CarDto carVoToDto(CarVo carVo);

}
