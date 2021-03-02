package com.oschina.testimport;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/11/26 15:24
 * @Version 1.0
 **/
@Configuration
@Import(TestBean.class)
public class TestImportAnnotation {
}
