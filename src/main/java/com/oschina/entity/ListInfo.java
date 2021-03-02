package com.oschina.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author hyly
 * @Description 清单信息
 * @Date 2020/11/6 10:19
 * @Version 1.0
 **/
@Data
public class ListInfo implements Serializable {
    private Long id;
    /**
     * 描述
     */
    private String description;
    /**
     * 顺序
     */
    private Integer sort;
    /**
     * 是否选中，选中为1，未选中为0
     */
    private Integer choice;
}
