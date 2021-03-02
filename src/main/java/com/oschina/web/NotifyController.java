package com.oschina.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/12/10 14:49
 * @Version 1.0
 **/
@RestController
@RequestMapping("notify")
public class NotifyController {

    @GetMapping("/msg")
    public void notifyMsg(@RequestParam String tableName){

        System.out.println(tableName);
    }

}
