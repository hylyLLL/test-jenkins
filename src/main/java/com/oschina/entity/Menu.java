package com.oschina.entity;/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/11/3 15:09
 * @Version 1.0
 **/

import lombok.Data;

import java.io.Serializable;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/11/3 15:09
 * @Version 1.0
 **/
@Data
public class Menu implements Serializable {
    private String name;
    private String url;
}
