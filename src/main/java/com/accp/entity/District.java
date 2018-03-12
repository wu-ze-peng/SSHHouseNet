package com.accp.entity;

import java.util.HashSet;
import java.util.Set;

public class District {
    private int id;
    private String name;
    private Set<Street> streets = new HashSet<Street>();

    public Set<Street> getStreets() {
        return streets;
    }

    public void setStreets(Set<Street> streets) {
        this.streets = streets;
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
}
