
package com.springboot.filter.FilterHandler;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class MainFilter implements Filter {

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req =
                (HttpServletRequest) request;

        HttpServletResponse resp =
                (HttpServletResponse) response;

        System.out.println("User is enter");

        System.out.println(req.getMethod());
        System.out.println(req.getRequestURI());

        // Get token from request header
        String token = req.getHeader("token");

        // Check token
        if (token == null || !token.equals("12345")) {

            System.out.println("Invalid token");

            // Send 401 Unauthorized
            resp.setStatus(
                    HttpServletResponse.SC_UNAUTHORIZED
            );

            resp.getWriter().write("Invalid Token");

            return;
        }

        // Valid token
        System.out.println("Valid token");

        // Continue to controller
        chain.doFilter(request, response);

        System.out.println("User is exit");
    }
}
