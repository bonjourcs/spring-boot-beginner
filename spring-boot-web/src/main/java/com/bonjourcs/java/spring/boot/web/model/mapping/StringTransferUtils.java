package com.bonjourcs.java.spring.boot.web.model.mapping;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/1/2
 */
@StringTransfer
public class StringTransferUtils {

    @V1Transfer
    public String toStringV1(String resource) {
        return "v1:" + resource;
    }

    @V2Transfer
    public String toStringV2(String resource) {
        return "v2:" + resource;
    }

}
