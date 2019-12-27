package com.bonjourcs.java.spring.boot.web.controller;

import com.bonjourcs.java.spring.boot.web.model.vo.Foo;
import com.bonjourcs.java.spring.boot.web.model.common.RetObj;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2019/12/26
 */
@RestController
@RequestMapping("/constraint")
public class ConstraintController {

    @PostMapping
    public RetObj<String> postConstraint(@Validated @RequestBody Foo foo) {
        return RetObj.success("SUCCESS");
    }

}
