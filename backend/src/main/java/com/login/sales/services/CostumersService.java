package com.login.sales.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.sales.entities.Costumers;
import com.login.sales.entities.dto.CostumersDTO;
import com.login.sales.repositories.CostumersRepository;

@Service
public class CostumersService {
    @Autowired
    private CostumersRepository repository;

    public List<CostumersDTO> findAll(){
        List<Costumers> costumers = repository.findAll();
        List<CostumersDTO> dtos = new ArrayList<>();
        for(Costumers p : costumers){
            dtos.add(CostumersDTO.of(p));
        }
        return dtos;
    }

    public CostumersDTO findById(long id){
        Optional<Costumers> costumer = repository.findById(id);
        return CostumersDTO.of(costumer.get());
    }

    public CostumersDTO addCostumer(CostumersDTO p){
        repository.save(p.toEntity());
        return p;
    }

    public void deleteCostumer(long id){
        repository.deleteById(id);
    }
}
