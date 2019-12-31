package com.bonjourcs.java.spring.boot.web.model.mapping;

import com.bonjourcs.java.spring.boot.web.model.dto.FooDto;
import com.bonjourcs.java.spring.boot.web.model.vo.Foo;
import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2019/12/31
 */
public class FooMapperTest {

    @Test
    public void testFooMapper() throws ParseException {

        Foo foo = new Foo();
        foo.setSize(10);
        foo.setOrderNum("SN-01-0012");
        foo.setDate(new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-01"));

        FooDto fooDto = FooMapper.INSTANCE.fooToDto(foo);
        Assert.assertEquals(10, fooDto.getSize());
        Assert.assertEquals("2019-01-01", fooDto.getDate());

    }
}
