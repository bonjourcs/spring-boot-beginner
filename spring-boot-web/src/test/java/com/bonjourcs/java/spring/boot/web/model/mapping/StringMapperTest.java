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
public class StringMapperTest {

    @Test
    public void testStringVo() {

        StringVo vo = new StringVo();
        vo.setVersion("1.1.0");
        vo.setName("vo");

        StringDto dto = StringMapper.INSTANCE.stringVoToDto(vo);
        Assert.assertEquals("v1:1.1.0", dto.getVersion());

    }
}
