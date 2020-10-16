package com.bonjourcs.java.spring.boot.web.config.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/10/16
 */
@Data
@Component
@ConfigurationProperties(prefix = "my.duration")
public class DurationProperties {

    @DurationUnit(ChronoUnit.DAYS)
    private Duration timeToLive = Duration.ofDays(100 * 365);

    @DurationUnit(ChronoUnit.DAYS)
    private Duration currentLive = Duration.ofDays(26 * 365);

}
