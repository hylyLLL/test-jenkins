package com.oschina.jdk8;

import cn.hutool.core.lang.Assert;

import java.util.HashMap;
import java.util.Optional;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/11/19 14:07
 * @Version 1.0
 **/
public class OptionTest{
    public static Optional<Object> optionalCreate(Integer a) {
        return Optional.ofNullable(a);
    }

    public static void main(String[] args) {
        optionalCreate(null).ifPresent(a->{
            System.out.println("传入的值:"+a);
        });
//        Assert.notEmpty(new HashMap());
        Assert.state(true);

        System.out.println("aaaaaaaa");

        boolean present = optionalCreate(2).isPresent();
        Assert.state(present);


        Object o = optionalCreate(2).orElse(new Test("orElse"));
        System.out.println(o);

        Object o1 = optionalCreate(2).orElseGet(() -> new Test("orElseGet"));
        System.out.println(o1);


/*
        try {
            Object o2 = optionalCreate(null).orElseThrow(() -> {
                return null;
            });
            System.out.println(o2);
        } catch (Throwable e) {
            e.printStackTrace();
        }
*/


        Test test = new Test("");
        test.test2((t1,t2) -> {
            System.out.println(t1);
            System.out.println(t2);
        });


//        Object o = optionalCreate(null).get();
    }
}
