//package com.oschina.testjenkins.advice;/**
// * @Author hyly
// * @Description TODO
// * @Date 2020/10/30 10:05
// * @Version 1.0
// **/
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.MethodParameter;
//import org.springframework.http.HttpInputMessage;
//import org.springframework.http.converter.HttpMessageConverter;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//import org.springframework.web.servlet.mvc.method.annotation.RequestBodyAdvice;
//
//import java.io.IOException;
//import java.lang.reflect.Type;
//
///**
// * @Author hyly
// * @Description TODO
// * @Date 2020/10/30 10:05
// * @Version 1.0
// **/
////表示对那些controller增加
////    @Component
//@RestControllerAdvice
//public class RequestAdvice implements RequestBodyAdvice {
//    /**
//     * 是否要执行当前requestAdvice中的增强业务
//     * @param methodParameter
//     * @param type
//     * @param aClass
//     * @return
//     */
//    @Override
//    public boolean supports(MethodParameter methodParameter, Type type, Class<? extends HttpMessageConverter<?>> aClass) {
//        System.out.println("supports");
//        System.out.println(methodParameter);
//        System.out.println(type);
//        return true;
//    }
//
//    /**
//     * springboot注入参数之前
//     * @param httpInputMessage
//     * @param methodParameter
//     * @param type
//     * @param aClass
//     * @return
//     * @throws IOException
//     */
//    @Override
//    public HttpInputMessage beforeBodyRead(HttpInputMessage httpInputMessage, MethodParameter methodParameter, Type type, Class<? extends HttpMessageConverter<?>> aClass) throws IOException {
//        System.out.println("requestBody中参数读取之前");
//        System.out.println(httpInputMessage);
//        System.out.println(methodParameter);
//        System.out.println(type);
//        return httpInputMessage;
//    }
//
//    @Override
//    public Object afterBodyRead(Object body, HttpInputMessage httpInputMessage, MethodParameter methodParameter, Type type, Class<? extends HttpMessageConverter<?>> aClass) {
//        System.out.println("body被读取完之后：");
//        System.out.println(httpInputMessage);
//        System.out.println(methodParameter);
//        System.out.println(type);
//        return body;
//    }
//
//    @Override
//    public Object handleEmptyBody(Object body, HttpInputMessage httpInputMessage, MethodParameter methodParameter, Type type, Class<? extends HttpMessageConverter<?>> aClass) {
//        System.out.println("body为空");
//        System.out.println(methodParameter);
//        System.out.println(body);
//        System.out.println(httpInputMessage);
//        System.out.println(type);
//        return null;
//    }
//}
