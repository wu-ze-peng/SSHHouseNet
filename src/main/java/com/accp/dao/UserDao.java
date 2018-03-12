package com.accp.dao;

import com.accp.entity.User;
import org.hibernate.Session;

import java.util.List;

public interface UserDao {

    /**
     *  验证用户
     * @param user
     */
    public User chackUser(User user, Session session);


    public int addUser(User user, Session session);

    public List<User> getUserList( Session session);
}
