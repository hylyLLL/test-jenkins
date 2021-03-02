package com.oschina.testjenkins.test;

import com.oschina.testjenkins.enumtest.Test;

import java.io.Serializable;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/10/9 19:02
 * @Version 1.0
 **/
public class UserDto implements Serializable {
    private String name;
    private String sex;
    private String addr;
    private Test test;


    private String test2;

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

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }
}
