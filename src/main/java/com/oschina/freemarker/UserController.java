package com.oschina.freemarker;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.oschina.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpSession;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/11/4 16:42
 * @Version 1.0
 **/
@Slf4j
@Controller
public class UserController {
    @Value("${user.key}")
    private String userKey;

    @Value("${user.username}")
    private String username;

    @Value("${user.password}")
    private String password;

    @GetMapping("login")
    public String login() {
        return "login";
    }

    @Transactional
    @GetMapping("postLogin")
    public String postLogin(Model model, String username, String password, HttpSession session) {
        if (StringUtils.isNotEmpty(username) && StringUtils.isNotEmpty(password)) {
            log.info("预登录用户名：{}",username);
            if (this.username.equals(username) && this.password.equals(password)) {
                User user = new User();
                user.setUsername(username);
                user.setPassword(password);
                session.setAttribute(userKey, user);
                return "redirect:index";
            }
        }

        model.addAttribute("msg", "用户名或密码错误");
        return "login";


    }

    @GetMapping("noAuthor")
    public String noAuthor(Model model) {
        model.addAttribute("msg", "未登录");
        return "noAuthor";
    }
}
