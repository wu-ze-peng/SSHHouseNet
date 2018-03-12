package com.accp.dao;

import com.accp.entity.House;
import org.hibernate.Session;

import java.util.List;

public interface HouseDao {

    public List<House> getHouseListByUser(int userid, Session session);

    public int addHouse(House house,Session session);
}
