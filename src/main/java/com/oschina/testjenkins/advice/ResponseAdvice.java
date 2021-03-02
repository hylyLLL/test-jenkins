//package com.oschina.testjenkins.advice;
//
//import org.springframework.core.MethodParameter;
//import org.springframework.http.MediaType;
//import org.springframework.http.server.ServerHttpRequest;
//import org.springframework.http.server.ServerHttpResponse;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;
//
//import javax.xml.ws.Response;
//
///**
// * @Author hyly
// * @Description TODO
// * @Date 2020/10/10 14:44
// * @Version 1.0
// **/
//@RestControllerAdvice
//public class ResponseAdvice implements ResponseBodyAdvice {
//    @Override
//    public boolean supports(MethodParameter methodParameter, Class aClass) {
//
//        return true;
//    }
//
//    @Override
//    public Object beforeBodyWrite(Object body, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
//        System.out.println("这是一个ResponseAdvice");
//        System.out.println(body.toString());
//        System.out.println("response");
//        return null;
//    }
//}
