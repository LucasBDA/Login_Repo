package com.login.sales.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Salesmen implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String cpf;
    private long total_sales;

    //Construtor sem o TOTAL_SALES. Afinal ele é preenchido automaticamente e não necessita ser instanciado com um valor fixo.
    public Salesmen(long id, String name, String cpf) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
    }
    public Salesmen(long id, String name, String cpf, long total_sales) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.total_sales = total_sales;
    }
    public Salesmen() {
    }
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
        Salesmen other = (Salesmen) obj;
        if (id != other.id)
            return false;
        return true;
    }
}
