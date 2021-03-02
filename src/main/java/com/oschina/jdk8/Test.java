package com.oschina.jdk8;

import org.apache.poi.ss.formula.functions.T;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/11/19 14:52
 * @Version 1.0
 **/
public class Test {
    public Test(String aa){
        System.out.println(aa);
    }


    public void test2(TestFunctionInterface<Integer> temp){
        temp.out(2,3);
    }

    public void Test() {
    }
}
