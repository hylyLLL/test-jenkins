package com.oschina.entity;/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/11/4 10:05
 * @Version 1.0
 **/

import lombok.Data;

import java.io.Serializable;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/11/4 10:05
 * @Version 1.0
 **/
@Data
public class CenterInfo implements Serializable {

    private String parentName;//上级中心名称

    private String name;//中心名称

    private Double longitude;//经度

    private Double latitude;//纬度

    private String address;//地址

    private String principal;//中心负责人

}
