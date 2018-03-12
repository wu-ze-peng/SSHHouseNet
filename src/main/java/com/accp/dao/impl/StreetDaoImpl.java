package com.accp.dao.impl;

import com.accp.dao.StreetDao;
import com.accp.entity.Street;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class StreetDaoImpl implements StreetDao {
    public List<Street> getStreetList(Session session) {
        Query query = session.createQuery("select s.id,s.name from Street s");
        return query.list();
    }
}
