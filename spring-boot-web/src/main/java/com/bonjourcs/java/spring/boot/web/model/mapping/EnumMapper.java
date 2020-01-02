package com.bonjourcs.java.spring.boot.web.model.mapping;

import com.bonjourcs.java.spring.boot.web.enums.Comment;
import com.bonjourcs.java.spring.boot.web.enums.Level;
import org.mapstruct.Mapper;
import org.mapstruct.ValueMapping;
import org.mapstruct.ValueMappings;
import org.mapstruct.factory.Mappers;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/1/2
 */
@Mapper
public interface EnumMapper {

    EnumMapper INSTANCE = Mappers.getMapper(EnumMapper.class);

    @ValueMappings({
            @ValueMapping(source = "BAD", target = "L1"),
            @ValueMapping(source = "GOOD", target = "L2"),
            @ValueMapping(source = "NORMAL", target = "L3"),
            @ValueMapping(source = "PERFECT", target = "L4")
    })
    Level commentToLevel(Comment comment);

}
