package com.lyf.assembly.annotation.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class Goods implements Serializable {

    private Integer id;
    private Date time;
    private String name;
    private Integer price;

    public Goods(Integer id, Date time, String name, Integer price) {
        this.id = id;
        this.time = time;
        this.name = name;
        this.price = price;
    }

    public Goods() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", time=" + time +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
