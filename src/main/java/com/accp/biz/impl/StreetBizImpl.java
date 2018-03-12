package com.accp.biz.impl;

import com.accp.biz.StreetBiz;
import com.accp.dao.StreetDao;
import com.accp.dao.impl.StreetDaoImpl;
import com.accp.entity.Street;
import com.accp.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class StreetBizImpl implements StreetBiz {
    private StreetDao streetDao = new StreetDaoImpl();

    public List<Street> getStreetList() {
        Session session = HibernateUtil.session();
        session.beginTransaction();
        List<Street> streetList = streetDao.getStreetList(session);
        return streetList;
    }
}
