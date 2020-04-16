package com.bonjourcs.java.spring.boot.web.model.mapping;

import com.bonjourcs.java.spring.boot.web.model.dto.BigDog;
import com.bonjourcs.java.spring.boot.web.model.dto.Dog;
import org.junit.Test;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/1/13
 */
public class DogMapperTest {


    @Test
    public void testDogToBigDog() {

        Dog dog = new Dog();
        dog.setColor("Blue");
        dog.setName("Kiki");

        BigDog bigDog = DogMapper.INSTANCE.dogToBigDog(dog);
        System.out.println(bigDog.getColor());
        System.out.println(bigDog);

    }
}
