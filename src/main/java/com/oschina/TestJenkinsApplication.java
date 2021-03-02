package com.oschina;

import com.google.common.collect.ImmutableMap;
import com.oschina.entity.TUser;
import com.oschina.excel.ExcelListerner;
import com.oschina.service.impl.TUserServiceImpl;
import net.bytebuddy.asm.Advice;
import org.mitre.dsmiley.httpproxy.ProxyServlet;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import javax.servlet.Servlet;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class TestJenkinsApplication {
    @Autowired
    private BeanFactory factory;

    public static void main(String[] args) {
        SpringApplication.run(TestJenkinsApplication.class, args);
    }

    @PostConstruct
    public void test(){
        TableA bean = factory.getBean(TableA.class);
        System.out.println(bean.getA());
    }
/*    @Autowired
    private TUserServiceImpl tUserService;

    @PostConstruct
    public void tet(){
        List<TUser> t = tUserService.listByName("t");
    }*/


    @Bean
    public Servlet baiduProxyServlet(){
        return new ProxyServlet();
    }

    @Bean
    public ServletRegistrationBean proxyServletRegistration(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(baiduProxyServlet(), "/baidu");
        Map<String, String> params = ImmutableMap.of(
                "targetUri", "http://www.baidu.com",
                "log", "true");
        registrationBean.setInitParameters(params);
        return registrationBean;
    }


}
