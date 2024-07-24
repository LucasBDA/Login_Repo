package com.login.sales.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.sales.entities.Sales_log;
import com.login.sales.entities.dto.Sales_logDTO;
import com.login.sales.repositories.Sales_logRepository;

@Service
public class Sales_logService {
    @Autowired
    private Sales_logRepository repository;

    public Sales_logDTO findById(long id){
        Optional<Sales_log> sales = repository.findById(id);
        return Sales_logDTO.of(sales.get());
    }

    public Sales_logDTO findBySaleId(long id){
        Optional<Sales_log> sales = repository.findBySaleId(id);
        return Sales_logDTO.of(sales.get());
    }

    public List<Sales_logDTO> findAll(){
        List<Sales_log> sales_log = repository.findAll();
        List<Sales_logDTO> dtos = new ArrayList<>();
        for(Sales_log p : sales_log){
            dtos.add(Sales_logDTO.of(p));
        }
        return dtos;
    }

    public Sales_logDTO newSale(Sales_logDTO sale){
        repository.save(sale.toEntity());
        return sale;
    }
}
