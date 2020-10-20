package com.bonjourcs.java.spring.boot.web.controller;

import com.bonjourcs.java.spring.boot.web.model.common.RetObj;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/10/20
 */
@RestController
public class RetObjController {

    @GetMapping("/retObj")
    public RetObj<String> getRetObj() {
        RetObj<String> retObj = RetObj.success("success");
        return retObj;
    }

}
