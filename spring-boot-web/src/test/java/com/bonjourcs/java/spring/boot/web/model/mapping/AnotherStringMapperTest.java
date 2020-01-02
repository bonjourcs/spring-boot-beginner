package com.bonjourcs.java.spring.boot.web.model.mapping;

import com.bonjourcs.java.spring.boot.web.model.dto.StringDto;
import com.bonjourcs.java.spring.boot.web.model.vo.StringVo;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/1/2
 */
public class AnotherStringMapperTest {

    @Test
    public void testStringVoToDto() {

        StringVo vo = new StringVo();
        vo.setName("vo");
        vo.setVersion("1.1.0");

        StringDto dto = AnotherStringMapper.INSTANCE.stringVoToDto(vo);
        Assert.assertEquals("v1:1.1.0", dto.getVersion());
        Assert.assertEquals("v2:vo", dto.getName());

    }
}
