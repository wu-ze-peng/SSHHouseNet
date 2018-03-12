package com.accp.biz.impl;

import com.accp.biz.DistrictBiz;
import com.accp.dao.DistrictDao;
import com.accp.dao.impl.DistrictDaoImpl;
import com.accp.entity.District;
import com.accp.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DistrictBizImpl implements DistrictBiz {

    private DistrictDao districtDao = new DistrictDaoImpl();

    public List<District> getDistrictList() {
        Session session = HibernateUtil.session();
        Transaction transaction = session.beginTransaction();
        List<District> districtList = districtDao.getDistrictList(session);
        return districtList;
    }
}
