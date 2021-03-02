package com.oschina.exception;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/11/23 9:40
 * @Version 1.0
 **/
public class ExceptionDemo {
    public static void main(String[] args) {
//        throw new OutOfMemoryError("内存不足");
//        int a=2/0;

        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("aa");

        String s = threadLocal.get();
    }
}
