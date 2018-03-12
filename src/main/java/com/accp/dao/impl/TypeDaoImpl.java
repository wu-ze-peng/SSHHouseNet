package com.accp.dao.impl;

import com.accp.dao.TypeDao;
import com.accp.entity.Type;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class TypeDaoImpl implements TypeDao {
    public List<Type> getTypeList(Session session) {
        Query query = session.createQuery("select t.id,t.name from Type t");
        return query.list();
    }
}
