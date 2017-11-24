package com.yzgaming.config;


import com.yzgaming.interceptor.LoginInterceptor;
import com.yzgaming.resolvers.CurrentUserMethodArgumentResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * 配置类，增加自定义拦截器和解析器
 * @author ScienJus
 * @date 2015/7/30.
 */
@Configuration
@ImportResource("classpath:spring/spring-mvc.xml")
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private LoginInterceptor loginInterceptor;

    @Autowired
    private CurrentUserMethodArgumentResolver currentUserMethodArgumentResolver;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor);
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(currentUserMethodArgumentResolver);
    }
}
