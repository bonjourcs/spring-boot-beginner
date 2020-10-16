package com.bonjourcs.java.spring.boot.web.config.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/10/16
 */
@Data
@Component
@ConfigurationProperties(prefix = "properties.weight")
public class WeightProperties {

    private Weight maxWeight = new Weight(1000);

}
