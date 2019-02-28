package com.bonjourcs.java.spring.boot.security.controller;

import com.bonjourcs.java.spring.boot.security.bean.common.RetObj;
import com.bonjourcs.java.spring.boot.security.bean.resp.ApiModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2019/2/27
 */
@RestController
public class ApiController {

    @GetMapping("/api/{version}")
    public RetObj<ApiModel> getApiVersion(@PathVariable("version") String version) {

        ApiModel apiModel = new ApiModel();
        apiModel.setVersion(version);
        apiModel.setLastModifyTime(System.currentTimeMillis() + "");

        RetObj<ApiModel> retObj = new RetObj<>();
        retObj.setRetMessage("DONE?!");
        retObj.setResult(apiModel);
        retObj.setRetCode(RetObj.CODE_SUCCESS);

        return retObj;
    }

    @GetMapping("/errors")
    public RetObj<String> error() {
        int num = 10 / 0;
        return new RetObj<>();
    }
}
