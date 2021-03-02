package com.oschina.testjenkins.aspect;

import lombok.Getter;

/**
 * @author tongcaili
 * @date 2020/6/22 09:48
 */
@Getter
public enum LogType {
    OPERA(0, "操作日志"),
    LOGIN(1, "登录日志");

    private final int num;

    private final String value;

    LogType(int num, String value) {
        this.num = num;
        this.value = value;
    }

    public static String getValue(int num) {
        for (LogType types : values()) {
            if (types.num == num) {
                return types.getValue();
            }
        }
        return null;
    }
}
