package com.zk.zuul.controller;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
public class MyFilter extends ZuulFilter {
    @Override
    public String filterType() {
//        pre：路由之前
//        touting：路由之时
//        post：路由之后
//        error：发送错误调用
        return "pre";
    }

    /**
     * 过滤的顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 这里写逻辑判断，是否需要过滤，true为永远过滤
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器的具体逻辑
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext ctx=RequestContext.getCurrentContext();
        HttpServletRequest request=ctx.getRequest();
        System.out.println(request.getMethod()+"------"+request.getRequestURI().toString());
        Object username=request.getParameter("username");
        if (username != null&&"zkk".equals(username.toString())) {
            ctx.setSendZuulResponse(false);
            ctx.getResponse().setContentType("text/html;charset=utf-8");
            try {
                ctx.getResponse().getWriter().write("监控到的用户名是zkk");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        return null;
    }


}
