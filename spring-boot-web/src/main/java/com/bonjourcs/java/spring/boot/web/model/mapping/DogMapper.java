package com.bonjourcs.java.spring.boot.web.model.mapping;

import com.bonjourcs.java.spring.boot.web.model.dto.BigDog;
import com.bonjourcs.java.spring.boot.web.model.dto.Dog;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.AfterMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/1/13
 */
@Mapper
@Slf4j
public abstract class DogMapper {

    public static final DogMapper INSTANCE = Mappers.getMapper(DogMapper.class);

    @BeforeMapping
    protected void before(Dog dog) {
        log.info("Before...");
    }

    @AfterMapping
    protected void after(Dog dog, @MappingTarget BigDog bigDog) {
        log.info("After...");
    }

    public abstract BigDog dogToBigDog(Dog dog);

}
