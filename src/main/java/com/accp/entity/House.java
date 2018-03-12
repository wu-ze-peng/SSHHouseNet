package com.accp.entity;

import java.util.Date;

public class House {
    private int id;
    private String title;
    private String description;
    private Float price;
    private Date pubdate;
    private Float floorage;
    private String contact;
    private Street street;
    private User user;
    private Type type;

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", pubdate=" + pubdate +
                ", floorage=" + floorage +
                ", contact='" + contact + '\'' +
                '}';
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Date getPubdate() {
        return pubdate;
    }

    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }

    public Float getFloorage() {
        return floorage;
    }

    public void setFloorage(Float floorage) {
        this.floorage = floorage;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
