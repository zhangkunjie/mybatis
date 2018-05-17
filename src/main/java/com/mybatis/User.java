package com.mybatis;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by kunjie.zhang on 2018/5/16.
 */
public class User implements Serializable {
    private int id;
    private int userId;
    private String name;
    private int age;
    private Timestamp createDate;
    private List<Goods> userGoods;


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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getUserId() {
        return userId;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public void setUserId(int userId) {
        this.userId = userId;

    }

    public List<Goods> getUserGoods() {
        return userGoods;
    }

    public void setUserGoods(List<Goods> userGoods) {
        this.userGoods = userGoods;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", createDate=" + createDate +
                '}';
    }
}
