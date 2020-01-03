package com.bonjourcs.java.spring.boot.web.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/1/3
 */
@Data
@NoArgsConstructor
public class Cat extends Animal {

    private int pows;

    private String intRegexp = "\\d{1,5}";

    public Cat(String name, int pows) {
        super(name);
        this.pows = pows;
    }

    public Cat(String name) {
        super(name);
        if (name != null && name.matches(intRegexp)) {
            this.pows = Integer.parseInt(name);
        }
    }

}
