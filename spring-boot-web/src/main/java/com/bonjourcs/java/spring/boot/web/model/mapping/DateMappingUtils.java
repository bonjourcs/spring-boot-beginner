package com.bonjourcs.java.spring.boot.web.model.mapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Liang Chenghao
 * Description: mapping utils
 * Date: 2019/12/31
 */
public class DateMappingUtils {

    public String dateToString(Date date) {
        return date == null ? null :
                new SimpleDateFormat("yyyy-MM-dd").format(date);
    }

    public Date stringToDate(String date) {
        try {
            return date == null ? null :
                    new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}
