package com.oschina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/11/4 16:49
 * @Version 1.0
 **/
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    /**
     * cors support
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean corsFilter() {
        // 注册CORS过滤器
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true); // 是否支持安全证书
        config.addAllowedOrigin("*"); // 允许任何域名使用
        config.addAllowedHeader("*"); // 允许任何头
        config.addAllowedMethod("*"); // 允许任何方法（post、get等）
        // 预检请求的有效期，单位为秒，解决每个api都会发送两次请求的问题
        config.setMaxAge(3600L);

        source.registerCorsConfiguration("/**", config);
        FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
        bean.setOrder(0);
        return bean;
    }

/*
    @Autowired
    private AuthorInterceptor authorInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry
                .addInterceptor(authorInterceptor)
                .addPathPatterns("/**","/")
                .excludePathPatterns("/login","/postLogin","/noAuthor");
    }
*/


}
