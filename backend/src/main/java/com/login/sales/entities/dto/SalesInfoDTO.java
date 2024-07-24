package com.login.sales.entities.dto;

public class SalesInfoDTO {
    private String salesmanName;
    private String productName;
    private float price;
    private int amountSold;
    private double totalSold;

    // Construtor
    public SalesInfoDTO(String salesmanName, String productName, float price, int amountSold, double totalSold) {
        this.salesmanName = salesmanName;
        this.productName = productName;
        this.price = price;
        this.amountSold = amountSold;
        this.totalSold = totalSold;
    }

    public String getSalesmanName() {
        return salesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmountSold() {
        return amountSold;
    }

    public void setAmountSold(int amountSold) {
        this.amountSold = amountSold;
    }

    public double getTotalSold() {
        return totalSold;
    }

    public void setTotalSold(double totalSold) {
        this.totalSold = totalSold;
    }
    
}
