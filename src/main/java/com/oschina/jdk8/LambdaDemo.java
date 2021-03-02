package com.oschina.jdk8;

import com.baomidou.mybatisplus.core.toolkit.support.Property;
import com.oschina.TableA;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/11/20 13:59
 * @Version 1.0
 **/
public class LambdaDemo {
    public static void main(String[] args) {
        Property<TableA, String> getA = TableA::getA;
        Property<Person, String> getPassword = Person::getPassword;

        System.out.println(getA);
    }
}
