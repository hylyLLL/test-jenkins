package com.oschina.jdk8;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.experimental.UtilityClass;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/11/20 9:16
 * @Version 1.0
 **/

//@JsonInclude(JsonInclude.Include.NON_NULL)
public class Person {
    private String userName;
    private Integer sex;
    @JsonIgnore
    private String password;

//        @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date time;

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
