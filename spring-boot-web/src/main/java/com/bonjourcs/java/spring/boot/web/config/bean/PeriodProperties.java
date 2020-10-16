package com.bonjourcs.java.spring.boot.web.config.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.PeriodUnit;
import org.springframework.stereotype.Component;

import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/10/16
 */
@Data
@Component
@ConfigurationProperties(prefix = "system.period")
public class PeriodProperties {

    @PeriodUnit(ChronoUnit.YEARS)
    private Period timeToLive = Period.ofYears(100);

    @PeriodUnit(ChronoUnit.YEARS)
    private Period currentTime = Period.ofYears(26);

}
