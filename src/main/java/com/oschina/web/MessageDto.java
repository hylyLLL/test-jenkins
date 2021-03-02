package com.oschina.web;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/12/10 14:50
 * @Version 1.0
 **/
@Data
public class MessageDto implements Serializable {
    private String tableName;
    private Long id;
    private String time;
}
