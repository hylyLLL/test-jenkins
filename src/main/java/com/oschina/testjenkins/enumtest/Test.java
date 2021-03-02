package com.oschina.testjenkins.enumtest;

import jdk.nashorn.internal.objects.annotations.Getter;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/9/24 17:20
 * @Version 1.0
 **/

public enum Test {
    First("第一"),
    Second("第二");

    Test(String el) {

    }

    public static String get(String type){
        for(Test typeEnum : Test.values()){
            if(typeEnum.name().equals(type)){
                return typeEnum.name();
            }
        }
        return "无";
    }
}
