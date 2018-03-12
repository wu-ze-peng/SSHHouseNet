package com.accp.dao.impl;

import com.accp.dao.DistrictDao;
import com.accp.entity.District;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class DistrictDaoImpl implements DistrictDao {
    public List<District> getDistrictList(Session session) {
        Query query = session.createQuery("select d.id,d.name from District d");
        return query.list();
    }
}
