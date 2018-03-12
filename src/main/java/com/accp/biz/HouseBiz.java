package com.accp.biz;

import com.accp.entity.House;

import java.util.List;

public interface HouseBiz {
    public List<House> getHouseListByUser(int userid);

    public int addHouse(House house);
}
