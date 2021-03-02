package com.oschina.jdk8;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/11/19 15:07
 * @Version 1.0
 **/
@FunctionalInterface
public interface TestFunctionInterface<T> {
    void out(T t1,T t2);
}
