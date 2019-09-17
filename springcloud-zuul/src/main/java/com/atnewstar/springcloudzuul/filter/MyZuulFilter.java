package com.atnewstar.springcloudzuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import javax.servlet.http.HttpServletRequest;


/**
 * @author XuKaiKai
 * @date 2019/9/16 20:25
 */
public class MyZuulFilter extends ZuulFilter {
    private static final Logger log = LoggerFactory.getLogger(MyZuulFilter.class);
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String ignoreUrl = request.getRequestURL().toString();
        if(ignoreUrl.contains("swagger-service")){
            return false;
        }
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info("send{} request to{}",request.getMethod(),request.getRequestURL().toString());
        Object accesstoken = request.getParameter("accesstoken");
        if(accesstoken == null){
            log.warn("access token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            }catch (Exception e){}

            return null;
        }
        log.info("access token ok");
        return null;
    }
}
