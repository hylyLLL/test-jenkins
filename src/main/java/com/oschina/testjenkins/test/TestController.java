package com.oschina.testjenkins.test;

import com.oschina.testjenkins.UserService;
import io.swagger.annotations.Api;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/5/25 14:19
 * @Version 1.0
 **/
@RestController
@RequestMapping("/test")
@Api("test")
public class TestController {
    @Autowired
    private UserService userService;

//    @SystemLog(module = "test", methods = "测试事务", logType = LogType.OPERA, operateType = OperateType.QUERY)
    @GetMapping("/hello")
    public String test(String msg) {
//        return userService.test();
        int a=Integer.parseInt(null);

        return msg;
    }


    @GetMapping("/ttt")
    public String test(User user) {
        return userService.test();
    }

    @Autowired
    ModelMapper modelMapper;

    @PostMapping("/add")
    public String add(@RequestBody User user,String a) {
        System.out.println(user);

        modelMapper.map(user, UserDto.class);
        return user.getName();
    }
}
