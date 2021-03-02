package com.oschina.testjenkins.aspect;


import lombok.Getter;

/**
 * @author tongcaili
 * @date 2020/6/22 09:48
 */
@Getter
public enum OperateType {
    EMPTY(-1,""),
    QUERY(0, "查询"),
    CREATE(1, "添加"),
    UPDATE(2, "修改"),
    DELETE(3, "删除"),
    EXPORT(4, "导出");

    private final int num;

    private final String value;

    OperateType(int num, String value) {
        this.num = num;
        this.value = value;
    }
/*
    public static String getValue(int num) {
        for (OperateType types : values()) {
            if (types.num == num) {
                return types.getValue();
            }
        }
        return null;
    }*/


}
