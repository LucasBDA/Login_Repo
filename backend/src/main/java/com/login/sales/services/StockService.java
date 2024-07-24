package com.login.sales.services;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.sales.entities.Stock;
import com.login.sales.entities.dto.StockDTO;
import com.login.sales.repositories.StockRepository;

@Service
public class StockService {

    @Autowired
    private StockRepository repository;

    public StockDTO findById(long id){
        Optional<Stock> stock = repository.findById(id);
        return StockDTO.of(stock.get());
    }

    public List<StockDTO> findByProductId(long idProduct){
        List<Stock> stock = repository.findByProduct_Id(idProduct);
        List<StockDTO> dtos = new ArrayList<>();
        for(Stock p : stock){
            dtos.add(StockDTO.of(p));
        }
        return dtos;
    }

    public List<StockDTO> findAll(){
        List<Stock> stock = repository.findAll();
        List<StockDTO> dtos = new ArrayList<>();
        for(Stock p : stock){
            dtos.add(StockDTO.of(p));
        }
        return dtos;
    }

    public StockDTO addToStock(StockDTO stockDTO){
        repository.save(stockDTO.toEntity());
        return stockDTO;
    }
}
