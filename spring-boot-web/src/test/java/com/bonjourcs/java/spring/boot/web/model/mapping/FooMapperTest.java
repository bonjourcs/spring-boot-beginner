package com.bonjourcs.java.spring.boot.web.model.mapping;

import com.bonjourcs.java.spring.boot.web.model.dto.FooDto;
import com.bonjourcs.java.spring.boot.web.model.vo.Foo;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2019/12/31
 */
public class FooMapperTest {

    @Test
    public void testFooMapper() {

        Foo foo = new Foo();
        foo.setSize(10);

        FooDto fooDto = FooMapper.INSTANCE.fooToDto(foo);
        Assert.assertEquals(10, fooDto.getSize());

    }
}
