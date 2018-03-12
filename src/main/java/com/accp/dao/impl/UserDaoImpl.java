package com.accp.dao.impl;

import com.accp.dao.UserDao;
import com.accp.entity.User;
import com.accp.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.util.List;

public class UserDaoImpl implements UserDao {

    public User chackUser(User user, Session session) {
        Query query = session.createQuery("from User u where u.name = :name and u.password = :password");
        query.setString("name",user.getName());
        query.setString("password",user.getPassword());
        User users = (User)query.uniqueResult();
        return users;
    }

    public int addUser(User user, Session session) {
        Serializable serializable = session.save(user);
        int result = 0;
        if(serializable!=null){
            result = 1;
        }
        return result;
    }

    public List<User> getUserList(Session session) {
        Query query = session.createQuery("from User");
        return query.list();
    }
}
