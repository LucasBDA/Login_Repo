package com.login.sales.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.sales.entities.Salesmen;
import com.login.sales.entities.dto.SalesInfoDTO;
import com.login.sales.entities.dto.SalesmenDTO;
import com.login.sales.repositories.SalesmenRepository;

@Service
public class SalesmenService {
    @Autowired
    private SalesmenRepository repository;

    public List<SalesmenDTO> findAll(){
        List<Salesmen> salesmen = repository.findAll();
        List<SalesmenDTO> dtos = new ArrayList<>();
        for(Salesmen p : salesmen){
            dtos.add(SalesmenDTO.of(p));
        }
        return dtos;
    }

    public SalesmenDTO findById(long id){
        Optional<Salesmen> salesman = repository.findById(id);
        return salesman.map(SalesmenDTO::of).orElse(null); // Usar map para converter e tratar Optional
    }

    public List<SalesInfoDTO> getSalesOfASalesman(long id){
        List<Object[]> results = repository.getSales(id); // Assumindo que retorna List<Object[]>
        List<SalesInfoDTO> dtos = new ArrayList<>();
        for (Object[] result : results) {
            String salesmanName = (String) result[0];
            String productName = (String) result[1];
            float price = (Float) result[2];
            int amountSold = (Integer) result[3];
            double totalSold = (Double) result[4];
            
            SalesInfoDTO dto = new SalesInfoDTO(salesmanName, productName, price, amountSold, totalSold);
            dtos.add(dto);
        }
        return dtos;
    }

    public SalesmenDTO addSalesman(SalesmenDTO p){
        Salesmen salesman = p.toEntity();
        repository.save(salesman);
        return SalesmenDTO.of(salesman); // Retorna o DTO atualizado
    }

    public void deleteSalesman(long id){
        repository.deleteById(id);
    }
}
