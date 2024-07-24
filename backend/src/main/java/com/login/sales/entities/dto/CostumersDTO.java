package com.login.sales.entities.dto;

import org.springframework.beans.BeanUtils;

import com.login.sales.entities.Costumers;

public class CostumersDTO {
    private long id;
    private String name;
    private String email;
    private String cpf;
    private String address;

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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public Costumers toEntity() {
        Costumers costumer = new Costumers();
        BeanUtils.copyProperties(this, costumer);
        return costumer;
    }

    public static CostumersDTO of(Costumers costumer) {
        CostumersDTO dto = new CostumersDTO();
        BeanUtils.copyProperties(costumer, dto);
        return dto;
    }
}
