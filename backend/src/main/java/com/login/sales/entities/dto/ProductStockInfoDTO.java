package com.login.sales.entities.dto;

public class ProductStockInfoDTO {
    private String name;
    private String sku;
    private int type;
    private String typeDesc;
    private float priceUnit;
    private double totalSalePotential;
    private float costUnit;
    private double totalCost;
    private String supplier;

    // Construtor
    public ProductStockInfoDTO(String name, String sku, int type, String typeDesc, float priceUnit, double totalSalePotential, float costUnit, double totalCost, String supplier) {
        this.name = name;
        this.sku = sku;
        this.type = type;
        this.typeDesc = typeDesc;
        this.priceUnit = priceUnit;
        this.totalSalePotential = totalSalePotential;
        this.costUnit = costUnit;
        this.totalCost = totalCost;
        this.supplier = supplier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public float getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(float priceUnit) {
        this.priceUnit = priceUnit;
    }

    public double getTotalSalePotential() {
        return totalSalePotential;
    }

    public void setTotalSalePotential(double totalSalePotential) {
        this.totalSalePotential = totalSalePotential;
    }

    public float getCostUnit() {
        return costUnit;
    }

    public void setCostUnit(float costUnit) {
        this.costUnit = costUnit;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    // Getters e setters
    
}
