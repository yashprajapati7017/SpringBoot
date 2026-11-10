package com.springboot.interceptors.Configuration;

import com.springboot.interceptors.InterceptorHandler.Authorzation;
import com.springboot.interceptors.InterceptorHandler.MainInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Config implements WebMvcConfigurer {

        MainInterceptor mainInterceptor;
        Authorzation authorzation;

    public Config(MainInterceptor mainInterceptor, Authorzation authorzation) {
        this.mainInterceptor = mainInterceptor;
        this.authorzation = authorzation;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(mainInterceptor).order(2);
        registry.addInterceptor(authorzation).order(1);
    }
}
