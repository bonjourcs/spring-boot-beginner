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
@Mapper(uses = StringTransferUtils.class)
public interface StringMapper {

    StringMapper INSTANCE = Mappers.getMapper(StringMapper.class);

    @Mapping(target = "version", qualifiedBy = {StringTransfer.class, V1Transfer.class})
    @Mapping(target = "name", qualifiedBy = {StringTransfer.class, V2Transfer.class})
    StringDto stringVoToDto(StringVo stringVo);

}
