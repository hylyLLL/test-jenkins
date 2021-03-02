package com.oschina.jdk8;

import lombok.Cleanup;
import lombok.SneakyThrows;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.stream.Stream;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/11/19 16:25
 * @Version 1.0
 **/
public class SneakThrowsTest {
    @SneakyThrows
    public static void testSneakThrows() {

        throw new Exception();
    }

    @SneakyThrows
    public static void main(String[] args) {
        Person person=new Person();
        person.setSex(2);
        person.setUserName("hyly");
        BeanInfo beanInfo = Introspector.getBeanInfo(Person.class,Object.class);
//        System.out.println(beanInfo.getBeanDescriptor());
    /*    Stream.of(beanInfo.getPropertyDescriptors()).forEach(item->{
//            System.out.println(item);

            Class<?> propertyType = item.getPropertyType();
            System.out.println(propertyType);
            System.out.println(item.getDisplayName());

            Method readMethod = item.getReadMethod();
            System.out.println(readMethod);
        });
*/
        String[] beanInfoSearchPath = Introspector.getBeanInfoSearchPath();
//        Stream.of(beanInfoSearchPath).forEach(item-> System.out.println(item));


        BeanInfo beanInfo1 = Introspector.getBeanInfo(Test.class);
        Stream.of(beanInfo1.getPropertyDescriptors()).forEach(item-> System.out.println(item.getPropertyEditorClass()));


        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();


        @Cleanup InputStream inputStream = new FileInputStream("");
    }
}
