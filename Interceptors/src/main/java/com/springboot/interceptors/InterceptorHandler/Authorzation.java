package com.springboot.interceptors.InterceptorHandler;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
@Component
public class Authorzation implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String Token = request.getHeader("token");

        if (Token == null || !Token.equals("12345")) {

            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            response.getWriter().write("invalid token");

            return false;

        }
        return true;
    }
}