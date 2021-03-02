package com.oschina.testimport;

import com.oschina.TableA;
import org.springframework.context.annotation.Bean;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/11/26 15:24
 * @Version 1.0
 **/
public class TestBean {
    @Bean
    public TableA createTableA(){
        TableA tableA = new TableA();
        tableA.setA("测试import");
        return tableA;
    }
}
