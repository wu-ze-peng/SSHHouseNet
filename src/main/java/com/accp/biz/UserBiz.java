package com.accp.biz;

import com.accp.entity.User;

import java.util.List;

public interface UserBiz {
    /**
     *  验证用户
     * @param user
     * @return
     */
    public User chackUser(User user);

    public int addUser(User user);

    public List<User> getUserList();
}
