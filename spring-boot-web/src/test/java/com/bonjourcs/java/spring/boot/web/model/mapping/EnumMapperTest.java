package com.bonjourcs.java.spring.boot.web.model.mapping;

import com.bonjourcs.java.spring.boot.web.enums.Comment;
import com.bonjourcs.java.spring.boot.web.enums.Level;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/1/2
 */
public class EnumMapperTest {

    @Test
    public void commentToLevel() {

        Comment comment = Comment.BAD;
        Level level = EnumMapper.INSTANCE.commentToLevel(comment);
        Assert.assertEquals(Level.L1, level);

    }

}
