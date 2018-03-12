package com.accp.interceptor;

import com.accp.action.UserAction;
import com.accp.entity.User;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * 用户登录拦截器
 */
public class LoginInterceptor extends AbstractInterceptor {

    /**
     * 拦截未登录用户
     * @param actionInvocation
     * @return
     * @throws Exception
     */
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        Object action = actionInvocation.getAction();
        if(action instanceof UserAction){
            return actionInvocation.invoke();
        }
        Object user =  actionInvocation.getInvocationContext().getSession().get("user");
        String path = actionInvocation.getInvocationContext().getName();
        if(user != null){
            return actionInvocation.invoke();
        }
        return "login";
    }
}
