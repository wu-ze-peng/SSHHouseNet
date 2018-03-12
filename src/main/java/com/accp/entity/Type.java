package com.accp.entity;

import java.util.HashSet;
import java.util.Set;

public class Type {
    private int id;
    private String name;
    private Set<House> houses = new HashSet<House>();

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

    public Set<House> getHouses() {
        return houses;
    }

    public void setHouses(Set<House> houses) {
        this.houses = houses;
    }
}
