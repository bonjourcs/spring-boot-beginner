package com.bonjourcs.java.spring.boot.web.model.mapping;

import com.bonjourcs.java.spring.boot.web.model.dto.Crash;
import com.bonjourcs.java.spring.boot.web.model.dto.Factory;
import com.bonjourcs.java.spring.boot.web.model.vo.Animal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.UUID;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/1/2
 */
@Mapper(imports = {Crash.class, UUID.class})
public interface FactoryMapper {

    FactoryMapper INSTANCE = Mappers.getMapper(FactoryMapper.class);

    @Mapping(target = "crash", expression = "java(new Crash(animal.getName()))")
    @Mapping(target = "location", source = "location", defaultExpression = "java(UUID.randomUUID().toString())")
    Factory animalToFactory(Animal animal);

}
