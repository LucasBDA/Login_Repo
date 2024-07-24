package com.login.sales.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Sales_log implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "id_salesman")
    private Salesmen salesmen;
    @ManyToOne
    @JoinColumn(name = "id_costumer")
    private Costumers costumer;
    @ManyToOne
    @JoinColumn(name = "id_product")
    private Products product;

    private long saleId;
    private int amount_sold;
    private String uf;
    private String city;

    
    public Sales_log(long id, Salesmen salesmen, Costumers costumer, Products product, long saleId, int amount_sold,
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
    public Sales_log() {
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
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Sales_log other = (Sales_log) obj;
        if (id != other.id)
            return false;
        return true;
    }
    
    
}
