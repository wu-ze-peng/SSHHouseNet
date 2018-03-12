package com.accp.dao;

import com.accp.entity.Type;
import org.hibernate.Session;

import java.util.List;

public interface TypeDao {
    public List<Type> getTypeList(Session session);
}
