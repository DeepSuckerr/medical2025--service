package com.wsj.medical2025.interceptor;
//登录拦截器  前端的每一个请求必须经过这个拦截器 校验token 有token就放行请求 ，否则就不放行


import com.alibaba.fastjson.JSONObject;
import com.wsj.medical2025.commons.JSONResult;
import com.wsj.medical2025.utils.CreateTokensTest;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {

        if (!(handler instanceof HandlerMethod)) {
            System.out.println("不是映射到controller上的请求");
            return true;
        }

        String token = request.getHeader("token");
        System.out.println("前端传过来的token是"+token);
        boolean flag = CreateTokensTest.checkToken(token);
        if (!flag) {
            JSONResult result = new JSONResult();
            result.setCode(2001);
            result.setMsg("无效的token");
            String jsonString = JSONObject.toJSONString(result);
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(jsonString);
            return false;

        }
        return true;
    }

}
