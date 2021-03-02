package com.oschina.entity;/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/11/4 13:39
 * @Version 1.0
 **/

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/11/4 13:39
 * @Version 1.0
 **/
@Data
@Configuration
@ConfigurationProperties(prefix = "list")
@PropertySource(value = "classpath:menuList.properties")
public class ListMenu {
    private List<Menu> menu;
}
