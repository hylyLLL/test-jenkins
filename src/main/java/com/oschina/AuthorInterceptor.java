package com.oschina;

import com.oschina.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author 登录验证器
 * @Description TODO
 * @Date 2020/11/3 17:23
 * @Version 1.0
 **/
@Slf4j
@Component
@Order(Integer.MIN_VALUE)
public class AuthorInterceptor implements HandlerInterceptor {

    @Value("${user.key}")
    private String userKey;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getMethod().equals(RequestMethod.OPTIONS.name())) {
            return true;
        }
//        response.setContentType("application/json;charset=UTF-8");
        User user = (User) request.getSession().getAttribute(userKey);
        if (user != null) {
            log.info("用户名：{}", user.getUsername());
            return true;
        }
        response.sendRedirect("noAuthor");

        return true;
    }
}
