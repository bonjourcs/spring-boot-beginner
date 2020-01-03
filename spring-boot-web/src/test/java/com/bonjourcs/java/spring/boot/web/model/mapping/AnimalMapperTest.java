package com.bonjourcs.java.spring.boot.web.model.mapping;

import com.bonjourcs.java.spring.boot.web.model.dto.Animal;
import com.bonjourcs.java.spring.boot.web.model.dto.Cat;
import com.bonjourcs.java.spring.boot.web.model.vo.CrashVo;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/1/3
 */
public class AnimalMapperTest {

    @Test
    public void testGetAnimal(){

        CrashVo crashVo = new CrashVo();
        crashVo.setName("4");

        Animal animal = AnimalMapper.INSTANCE.getAnimal(crashVo);
        boolean isCat = animal instanceof Cat;
        Assert.assertTrue(isCat);


    }
}
