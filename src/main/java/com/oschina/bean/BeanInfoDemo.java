package com.oschina.bean;

import com.oschina.jdk8.Person;
import lombok.SneakyThrows;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/11/23 14:03
 * @Version 1.0
 **/
public class BeanInfoDemo {
    @SneakyThrows
    public static void main(String[] args) {
        BeanInfo beanInfo = Introspector.getBeanInfo(Person.class);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
            System.out.println(propertyDescriptor.getName());
        }
    }
}
