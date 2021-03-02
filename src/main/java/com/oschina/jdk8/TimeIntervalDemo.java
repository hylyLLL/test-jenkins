package com.oschina.jdk8;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;
import lombok.SneakyThrows;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/11/20 9:39
 * @Version 1.0
 **/
public class TimeIntervalDemo {
    @SneakyThrows
    public static void main(String[] args) {
        DateTime date = DateUtil.date(new Date().getTime() - 100);
        TimeInterval timeInterval=DateUtil.timer();

    }
}
