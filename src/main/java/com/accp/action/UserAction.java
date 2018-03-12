package com.accp.action;

import com.accp.biz.UserBiz;
import com.accp.biz.impl.UserBizImpl;
import com.accp.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;
import java.util.Map;

public class UserAction extends ActionSupport {
    private User user;
    private String repassword;
    private List<User> users;
    UserBiz userBiz = new UserBizImpl();

    public String usersLoad(){
        users = userBiz.getUserList();
        return "success";
    }

    public int checkLogin(){
        if(null==user.getName() || user.getName().length() == 0){
            addFieldError("name","用户名不能为空");
            return 0;
        }
        if(user.getPassword()==null || user.getPassword().length() == 0){
            addFieldError("pwd","密码不能为空");
            return 0;
        }
        return 1;
    }

    public int checkRegister(){
        if(null==user.getName() || user.getName().length() == 0){
            addFieldError("name","用户名不能为空");
            return 0;
        }
        if(user.getPassword()==null || user.getPassword().length() == 0){
            addFieldError("pwd","密码不能为空");
            return 0;
        }
        if(null==user.getTelephone() || user.getTelephone().length() == 0){
            addFieldError("telephone","联系电话不能为空");
            return 0;
        }
        if(user.getUsername()==null || user.getUsername().length() == 0){
            addFieldError("username","用户姓名不能为空");
            return 0;
        }
        if(repassword==null || repassword.length() == 0){
            addFieldError("repwd","确认密码不能为空");
            return 0;
        }
        if(!user.getPassword().equals(getRepassword())){
            addFieldError("check","密码不一致");
            return 0;
        }
        return 1;
    }

    public String userLogin(){
        if (checkLogin() == 1){
            user = userBiz.chackUser(user);
            if(user != null){
                Map<String, Object> session = ActionContext.getContext().getSession();
                session.put("user",user);
                addFieldError("ture","登录成功");
                return "manage";
            }
            addFieldError("false","检查密码或者用户名是否正确");
            return INPUT;
        }else{
            return INPUT;
        }
    }

    public String userGoRegister(){
        return "register";
    }

    public String userRegister(){
        if(checkRegister() ==1){
            int result = userBiz.addUser(user);
            if(result == 1){
                return "success";
            }else{
                return "register";
            }
        }
        return "register";
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
