package com.oschina.entity;/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/11/3 16:21
 * @Version 1.0
 **/

import lombok.Data;

import java.io.Serializable;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/11/3 16:21
 * @Version 1.0
 **/
@Data
public class User implements Serializable {
    private String username;
    private String password;
}
