package com.bonjourcs.java.spring.boot.web.model.mapping;

import com.bonjourcs.java.spring.boot.web.model.dto.Animal;
import com.bonjourcs.java.spring.boot.web.model.dto.Cat;
import com.bonjourcs.java.spring.boot.web.model.vo.CrashVo;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/1/3
 */
@Mapper(uses = AnimalFactory.class)
public interface AnimalMapper {

    AnimalMapper INSTANCE = Mappers.getMapper(AnimalMapper.class);

    @BeanMapping(resultType = Cat.class)
    Animal getAnimal(CrashVo crashVo);

}
