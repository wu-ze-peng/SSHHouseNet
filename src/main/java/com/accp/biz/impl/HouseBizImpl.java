package com.accp.biz.impl;

import com.accp.biz.HouseBiz;
import com.accp.dao.HouseDao;
import com.accp.dao.impl.HouseDaoImpl;
import com.accp.entity.House;
import com.accp.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class HouseBizImpl implements HouseBiz {

    private HouseDao houseDao = new HouseDaoImpl();

    public List<House> getHouseListByUser(int userid) {
        Session session = HibernateUtil.session();
        session.beginTransaction();
        List<House> houseList = houseDao.getHouseListByUser(userid, session);
        return houseList;
    }

    public int addHouse(House house) {
        Session session = HibernateUtil.session();
        Transaction transaction = session.beginTransaction();
        int result = houseDao.addHouse(house,session);
        transaction.commit();
        return result;
    }
}
