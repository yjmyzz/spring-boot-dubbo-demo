package com.cnblogs.yjmyzz.dao.model.product;

import java.math.BigDecimal;
import javax.persistence.*;

public class Product {
    /**
     * 流水号
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 产品名称
     */
    private String name;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 获取流水号
     *
     * @return id - 流水号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置流水号
     *
     * @param id 流水号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取产品名称
     *
     * @return name - 产品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置产品名称
     *
     * @param name 产品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取价格
     *
     * @return price - 价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置价格
     *
     * @param price 价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}