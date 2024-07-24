package com.login.sales.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.sales.entities.Products;
import com.login.sales.entities.dto.ProductStockInfoDTO;
import com.login.sales.entities.dto.ProductsDTO;
import com.login.sales.repositories.ProductsRepository;

@Service
public class ProductsService {
    
    @Autowired
    private ProductsRepository repository;

    public List<ProductsDTO> findAll(){
        List<Products> products = repository.findAll();
        List<ProductsDTO> dtos = new ArrayList<>();
        for(Products p : products){
            dtos.add(ProductsDTO.of(p));
        }
        return dtos;
    }

    public ProductsDTO findById(long id){
        Optional<Products> product = repository.findById(id);
        return ProductsDTO.of(product.get());
    }

    public List<ProductStockInfoDTO> getMoreProductInfo(long id){
        List<Object[]> results = repository.findMoreInformationById(id);
        List<ProductStockInfoDTO> dtos = new ArrayList<>();
        for (Object[] result : results) {
            String name = (String) result[0];
            String sku = (String) result[1];
            int type = (Integer) result[2];
            String typeDesc = (String) result[3];
            float priceUnit = (Float) result[4];
            double totalSalePotential = (Double) result[5];
            float costUnit = (Float) result[6]; 
            double totalCost = (Double) result[7];
            String supplier = (String) result[8];
            
            ProductStockInfoDTO dto = new ProductStockInfoDTO(name, sku, type, typeDesc, priceUnit, totalSalePotential, costUnit, totalCost, supplier);
            dtos.add(dto);
        }
        return dtos;
    }
    

    public ProductsDTO addProduct(ProductsDTO p){
        repository.save(p.toEntity());
        return p;
    }

    public void deleteProduct(long id){
        repository.deleteById(id);
    }
}
