package com.example.demo.config;

import com.example.demo.interceptor.AuthInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthInterceptor())
                .addPathPatterns("/api/**") // 拦截 /api 下所有请求
                .excludePathPatterns(
                        "/api/users/login",   // 放行登录接口
                        "/api/users",     // 放行新增用户接口
                        "/api/users/*"        // 放行获取用户信息接口
                );
    }
}
