package com.oschina.exception;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/11/23 11:21
 * @Version 1.0
 **/
@Controller
@RequestMapping("/error")
public class TestErrorController implements ErrorController {

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
