package com.oschina.testjenkins.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/5/25 14:19
 * @Version 1.0
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("hello")
    public String test(String msg){
        return msg;
    }
}
