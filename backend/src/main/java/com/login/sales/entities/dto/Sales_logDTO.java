package com.login.sales.entities.dto;

import org.springframework.beans.BeanUtils;

import com.login.sales.entities.Costumers;
import com.login.sales.entities.Products;
import com.login.sales.entities.Sales_log;
import com.login.sales.entities.Salesmen;

public class Sales_logDTO {
    private long id;
    private Salesmen salesmen;
    private Costumers costumer;
    private Products product;

    private long saleId;
    private int amount_sold;
    private String uf;
    private String city;    
    
    public Sales_logDTO(long id, Salesmen salesmen, Costumers costumer, Products product, long saleId, int amount_sold,
            String uf, String city) {
        this.id = id;
        this.salesmen = salesmen;
        this.costumer = costumer;
        this.product = product;
        this.saleId = saleId;
        this.amount_sold = amount_sold;
        this.uf = uf;
        this.city = city;
    }
    public Sales_logDTO() {
        //TODO Auto-generated constructor stub
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Salesmen getSalesmen() {
        return salesmen;
    }
    public void setSalesmen(Salesmen salesmen) {
        this.salesmen = salesmen;
    }
    public Costumers getCostumer() {
        return costumer;
    }
    public void setCostumer(Costumers costumer) {
        this.costumer = costumer;
    }
    public Products getProduct() {
        return product;
    }
    public void setProduct(Products product) {
        this.product = product;
    }
    public long getSaleId() {
        return saleId;
    }
    public void setSaleId(long saleId) {
        this.saleId = saleId;
    }
    public int getAmount_sold() {
        return amount_sold;
    }
    public void setAmount_sold(int amount_sold) {
        this.amount_sold = amount_sold;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public Sales_log toEntity() {
        Sales_log salesLog = new Sales_log();
        BeanUtils.copyProperties(this, salesLog);
        return salesLog;
    }

    public static Sales_logDTO of(Sales_log salesLog) {
        Sales_logDTO dto = new Sales_logDTO();
        BeanUtils.copyProperties(salesLog, dto);
        return dto;
    }
}
