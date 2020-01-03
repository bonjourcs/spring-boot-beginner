package com.bonjourcs.java.spring.boot.web.model.mapping;

import com.bonjourcs.java.spring.boot.web.model.dto.Cat;
import com.bonjourcs.java.spring.boot.web.model.dto.Dog;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/1/3
 */
public class AnimalFactory {

    public Dog getDog(){
        return new Dog();
    }

    public Cat getCat(){
        return new Cat();
    }

    public Cat getCat(String name){
        return new Cat(name);
    }

}
