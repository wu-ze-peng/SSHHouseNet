package com.accp.biz.impl;

import com.accp.biz.TypeBiz;
import com.accp.dao.TypeDao;
import com.accp.dao.impl.TypeDaoImpl;
import com.accp.entity.Type;
import com.accp.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class TypeBizImpl implements TypeBiz {

    private TypeDao typeDao = new TypeDaoImpl();
    public List<Type> getTypeList() {
        Session session = HibernateUtil.session();
        Transaction transaction = session.beginTransaction();
        List<Type> typeList = typeDao.getTypeList(session);
        return typeList;
    }
}
