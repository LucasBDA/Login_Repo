package com.login.sales.entities.dto;


import org.springframework.beans.BeanUtils;

import com.login.sales.entities.Products;
import com.login.sales.entities.Stock;

public class StockDTO {
    private long id;
    private Products product;
    private int amount;
    private float cost;
    private String supplier;
    private int type;
    private String type_desc;
    
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Products getProduct() {
        return product;
    }
    public void setProduct(Products product) {
        this.product = product;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public String getSupplier() {
        return supplier;
    }
    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public String getType_desc() {
        return type_desc;
    }
    public void setType_desc(String type_desc) {
        this.type_desc = type_desc;
    }
    
    public Stock toEntity() {
        Stock stock = new Stock();
        BeanUtils.copyProperties(this, stock);
        return stock;
    }

    public static StockDTO of(Stock stock) {
        StockDTO dto = new StockDTO();
        BeanUtils.copyProperties(stock, dto);
        return dto;
    }

}
