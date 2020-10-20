package com.bonjourcs.java.spring.boot.web.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/10/20
 */
@Service
@Slf4j
public class CacheService {

    private final ValueService valueService;

    @Autowired
    public CacheService(ValueService valueService) {
        this.valueService = valueService;
    }

    @Cacheable("memory-cache")
    public String getCacheString() {
        return valueService.getString();
    }

}
