package com.bonjourcs.java.spring.boot.security.bean.resp;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2019/2/27
 */
@Data
public class ApiModel implements Serializable {

    private static final long serialVersionUID = -136175761405434943L;

    /**
     * api version
     */
    private String version;

    /**
     * api last modify time
     */
    private String lastModifyTime;

}
