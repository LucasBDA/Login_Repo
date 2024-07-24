package com.login.sales.entities.dto;

import java.io.Serializable;

import org.springframework.beans.BeanUtils;

import com.login.sales.entities.Salesmen;

public class SalesmenDTO implements Serializable{
    private long id;
    private String name;
    private String cpf;
    private long total_sales;

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
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public long getTotal_sales() {
        return total_sales;
    }
    public void setTotal_sales(long total_sales) {
        this.total_sales = total_sales;
    }

    public Salesmen toEntity() {
        Salesmen salesman = new Salesmen();
        BeanUtils.copyProperties(this, salesman);
        return salesman;
    }

    public static SalesmenDTO of(Salesmen salesman) {
        SalesmenDTO dto = new SalesmenDTO();
        BeanUtils.copyProperties(salesman, dto);
        return dto;
    }
}
