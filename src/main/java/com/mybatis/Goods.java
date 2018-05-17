package com.mybatis;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by kunjie.zhang on 2018/5/16.
 */
public class Goods implements Serializable {
    private int id;
    private int userId;
    private String goodsName;
    private BigDecimal price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", userId=" + userId +
                ", goodsName='" + goodsName + '\'' +
                ", price=" + price +
                '}';
    }
}
