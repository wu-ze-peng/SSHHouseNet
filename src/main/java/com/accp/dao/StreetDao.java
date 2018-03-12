package com.accp.dao;

import com.accp.entity.Street;
import org.hibernate.Session;

import java.util.List;

public interface StreetDao {
    public List<Street> getStreetList(Session session);
}
