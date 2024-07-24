package com.login.sales.entities.dto;

import java.io.Serializable;

import org.springframework.beans.BeanUtils;

import com.login.sales.entities.Products;

public class ProductsDTO implements Serializable{
    private long id;
    private String name;
    private String SKU;
    private String desc;
    private float price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String sKU) {
        SKU = sKU;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Products toEntity() {
        Products product = new Products();
        BeanUtils.copyProperties(this, product);
        return product;
    }

    public static ProductsDTO of(Products product) {
        ProductsDTO dto = new ProductsDTO();
        BeanUtils.copyProperties(product, dto);
        return dto;
    }

}
