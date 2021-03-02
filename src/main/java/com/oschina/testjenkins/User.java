package com.oschina.testjenkins.test;

import com.oschina.testjenkins.enumtest.Test;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/5/27 22:12
 * @Version 1.0
 **/
public class User {
    private String name;
    private String sex;
    private String addr;
    private Test test;

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", addr='" + addr + '\'' +
                ", test=" + Test.get(test.name())+
                '}';
    }
}
