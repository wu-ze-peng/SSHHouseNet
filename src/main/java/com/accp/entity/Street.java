package com.accp.entity;

import java.util.HashSet;
import java.util.Set;

public class Street {
    private int id;
    private String name;
    private District district;
    private Set<House> houses =  new HashSet<House>();

    @Override
    public String toString() {
        return "Street{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Set<House> getHouses() {
        return houses;
    }

    public void setHouses(Set<House> houses) {
        this.houses = houses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
}
