package com.oschina.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.StringHttpMessageConverter;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/11/20 14:28
 * @Version 1.0
 **/
@Configuration
public class FastJsonConfig {
    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters() {
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        // 创建配置类
        com.alibaba.fastjson.support.config.FastJsonConfig config = new com.alibaba.fastjson.support.config.FastJsonConfig();
        config.setSerializerFeatures(
                SerializerFeature.PrettyFormat,
                SerializerFeature.DisableCircularReferenceDetect,
                SerializerFeature.WriteNullListAsEmpty,
                SerializerFeature.WriteMapNullValue,
                SerializerFeature.WriteNullStringAsEmpty
        );

        //此处是全局处理方式
        config.setDateFormat("yyyy-MM-dd HH:mm:ss");
        config.setCharset(Charset.forName("UTF-8"));
        fastConverter.setFastJsonConfig(config);

        List<MediaType> supportedMediaTypes = new ArrayList<>();
        supportedMediaTypes.add(MediaType.ALL);
        fastConverter.setSupportedMediaTypes(supportedMediaTypes);
        //支持text 转string
        StringHttpMessageConverter stringHttpMessageConverter = new StringHttpMessageConverter();
        return new HttpMessageConverters(fastConverter, stringHttpMessageConverter);
    }
}
