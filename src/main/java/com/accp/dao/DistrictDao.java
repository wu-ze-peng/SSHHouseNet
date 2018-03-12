package com.accp.dao;

import com.accp.entity.District;
import org.hibernate.Session;

import java.util.List;

public interface DistrictDao {
    public List<District> getDistrictList(Session session);
}
