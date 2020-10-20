package com.bonjourcs.java.spring.boot.web.controller;

import com.bonjourcs.java.spring.boot.web.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/10/20
 */
@RestController
public class CacheController {

    private final CacheService cacheService;

    @Autowired
    public CacheController(CacheService cacheService) {
        this.cacheService = cacheService;
    }

    @GetMapping("/cache")
    public String getCache() {
        return cacheService.getCacheString();
    }

}
