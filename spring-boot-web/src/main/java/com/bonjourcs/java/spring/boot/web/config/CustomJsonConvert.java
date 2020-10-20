package com.bonjourcs.java.spring.boot.web.config;

import com.bonjourcs.java.spring.boot.web.model.common.RetObj;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2020/10/20
 */
public class CustomJsonConvert implements HttpMessageConverter<RetObj> {

    private ObjectMapper objectMapper = new ObjectMapper();

    private List<MediaType> supportedMediaTypes = Arrays.asList(
            new MediaType("application", "bonjourcs", StandardCharsets.UTF_8)
    );

    @Override
    public boolean canRead(Class<?> aClass, MediaType mediaType) {
        if (RetObj.class.isAssignableFrom(aClass)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean canWrite(Class<?> aClass, MediaType mediaType) {
        if (RetObj.class.isAssignableFrom(aClass)) {
            return true;
        }
        return false;
    }

    @Override
    public List<MediaType> getSupportedMediaTypes() {
        return supportedMediaTypes;
    }

    @Override
    public RetObj read(Class<? extends RetObj> aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }

    @Override
    public void write(RetObj retObj, MediaType mediaType, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {
        String msg = retObj.getMsg();
        if (msg != null) {
            retObj.setMsg("rewrite: " + msg);
        }
        objectMapper.writeValue(httpOutputMessage.getBody(), retObj);
    }

}
