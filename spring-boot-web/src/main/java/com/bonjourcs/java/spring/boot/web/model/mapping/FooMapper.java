package com.bonjourcs.java.spring.boot.web.model.mapping;

import com.bonjourcs.java.spring.boot.web.model.dto.FooDto;
import com.bonjourcs.java.spring.boot.web.model.vo.Foo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2019/12/31
 */
@Mapper
public interface FooMapper {

    FooMapper INSTANCE = Mappers.getMapper(FooMapper.class);

    FooDto fooToDto(Foo foo);

}
