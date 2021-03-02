package com.oschina.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class HostBindCardDto implements Serializable {

    @ExcelProperty(index = 0)
    private Long id;


    @ExcelProperty(index = 1)
    private Integer dataHostId;  //所属主机

    @ExcelProperty(index = 2)
    private Long deviceTypeId;  //设备类型ID

    @ExcelProperty(index = 3)
    private String deviceTypeName;  //设备类型名称

    @ExcelProperty(index = 4)
    private String deviceTypeNo;    //设备类型编号

    @ExcelProperty(index = 5)
    private String cardNo;  //卡片编号

    @ExcelProperty(index = 6)
    private Integer pathType;   //路数    1路还是2路

    @ExcelProperty(index = 7)
    private Integer cardType; //卡片类型，1开关量 2模拟量

    @ExcelProperty(index = 8)
    private Integer versionNo;  //更新版本号
}
