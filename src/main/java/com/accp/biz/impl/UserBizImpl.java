package com.accp.biz.impl;

import com.accp.biz.UserBiz;
import com.accp.dao.UserDao;
import com.accp.dao.impl.UserDaoImpl;
import com.accp.entity.User;
import com.accp.util.HibernateUtil;
import com.opensymphony.xwork2.ActionContext;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Map;

public class UserBizImpl implements UserBiz {

    private UserDao userDao=new UserDaoImpl();

    public User chackUser(User user) {
        Session session = HibernateUtil.session();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        user = userDao.chackUser(user,session);
        transaction.commit();
        return user;
    }

    public int addUser(User user) {
        Session session = HibernateUtil.session();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        int result =  userDao.addUser(user,session);
        transaction.commit();
        return result;
    }

    public List<User> getUserList() {
        Session session = HibernateUtil.session();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        List<User> list = userDao.getUserList(session);
        transaction.commit();
        return list;
    }
}
