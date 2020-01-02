package com.bonjourcs.java.spring.boot.web.model.mapping;

import com.bonjourcs.java.spring.boot.web.model.dto.StringDto;
import com.bonjourcs.java.spring.boot.web.model.vo.StringVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/1/2
 */
@Mapper(uses = AnotherStringUtils.class)
public interface AnotherStringMapper {

    AnotherStringMapper INSTANCE = Mappers.getMapper(AnotherStringMapper.class);

    @Mapping(target = "version", qualifiedByName = {"MS::StringUtils", "MS::V1Transfer"})
    @Mapping(target = "name", qualifiedByName = {"MS::StringUtils", "MS::V2Transfer"})
    StringDto stringVoToDto(StringVo stringVo);

}
