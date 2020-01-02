package com.bonjourcs.java.spring.boot.web.model.mapping;

import com.bonjourcs.java.spring.boot.web.model.dto.Factory;
import com.bonjourcs.java.spring.boot.web.model.vo.Animal;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/1/2
 */
public class FactoryMapperTest {

    @Test
    public void testBuildFactory() {

        Animal animal = new Animal();
        animal.setName("dog");

        Factory factory = FactoryMapper.INSTANCE.animalToFactory(animal);
        Assert.assertEquals("dog", factory.getCrash().getName());

    }
}
