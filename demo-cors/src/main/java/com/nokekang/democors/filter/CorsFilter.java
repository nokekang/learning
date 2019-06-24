package com.nokekang.democors.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description TODO
 * @Author sunjiankang
 * @Date 2019/6/24 17:04
 */
//@Component
public class CorsFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse rep = (HttpServletResponse) servletResponse;
        rep.setHeader("Access-Control-Allow-Origin", "*");// 允许任何域名使用
        rep.setHeader("Access-Control-Allow-Methods", "*");// 允许任何方法（post、get等）
        rep.setHeader("Access-Control-Max-Age", "3600");
        rep.setHeader("Access-Control-Allow-Headers", "*");// 允许任何头
        filterChain.doFilter(req, rep);
    }

    @Override
    public void destroy() {

    }
}
