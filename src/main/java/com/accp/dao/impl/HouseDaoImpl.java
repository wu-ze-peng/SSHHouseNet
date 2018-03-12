package com.accp.dao.impl;

import com.accp.dao.HouseDao;
import com.accp.entity.House;
import org.hibernate.Query;
import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;

public class HouseDaoImpl implements HouseDao {
    public List<House> getHouseListByUser(int userid, Session session) {
        String hql = " from House h where h.user.id = "+userid;
        Query query = session.createQuery(hql);
        return query.list();
    }

    public int addHouse(House house, Session session) {
        Serializable serializable = session.save(house);
        int result = 0;
        if(serializable != null){
            result = 1;
        }
        return result;
    }
}
