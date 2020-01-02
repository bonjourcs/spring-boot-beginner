package com.bonjourcs.java.spring.boot.web.model.mapping;

import org.mapstruct.Named;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/1/2
 */
@Named("MS::StringUtils")
public class AnotherStringUtils {

    @Named("MS::V1Transfer")
    public String toStringV1(String resource){
        return "v1:" + resource;
    }

    @Named("MS::V2Transfer")
    public String toStringV2(String resource) {
        return "v2:" + resource;
    }

}

