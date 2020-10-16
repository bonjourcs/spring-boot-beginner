package com.bonjourcs.java.spring.boot.web.config.bean;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/10/16
 */
@Component
@ConfigurationPropertiesBinding
public class WeightConvert implements Converter<String, Weight> {

    @Override
    public Weight convert(String s) {
        return new Weight(Long.parseLong(s));
    }

}
