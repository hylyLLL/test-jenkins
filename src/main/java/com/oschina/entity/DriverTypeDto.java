package com.oschina.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

import java.io.Serializable;

@Data
public class DriverTypeDto  implements Serializable    {

    @ExcelProperty(index = 0)
    private Long id;

    @ExcelProperty(index = 1)
    private String name;    //设备名称

    @ExcelProperty(index = 2)
    private String no;  //设备编号

    @ExcelProperty(index = 3)
    private String formula; //对应设备的转换公式

    @ExcelProperty(index = 4)
    private Integer version;  //更新版本号
}
