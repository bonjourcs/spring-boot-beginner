package com.bonjourcs.java.spring.boot.web.model.mapping;

import com.bonjourcs.java.spring.boot.web.model.dto.CarDto;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/1/3
 */
@Slf4j
public class DtoFactory {

    public CarDto createCarDto() {
        log.info("build car dto");
        return new CarDto();
    }

}
