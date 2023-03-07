package com.example.day3.Interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)throws Exception{
        Object user = request.getSession().getAttribute("user");
        if (user==null){
            request.setAttribute("msg", "No authority");
            request.getRequestDispatcher("/").forward(request, response);
            return false;
        }
        return true;
    }
}
