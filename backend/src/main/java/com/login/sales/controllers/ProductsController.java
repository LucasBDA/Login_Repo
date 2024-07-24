package com.login.sales.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.login.sales.entities.dto.ProductStockInfoDTO;
import com.login.sales.entities.dto.ProductsDTO;
import com.login.sales.services.ProductsService;

@Controller
@RestController
public class ProductsController {
	@Autowired
	private ProductsService service;
	
	@GetMapping("/product/{id}")
	public ProductsDTO getProductById(@PathVariable Long id){
		return service.findById(id);
	}

    @GetMapping("/product")
	public List<ProductsDTO> getAllProducts(){
		return service.findAll();
	}
	
	@GetMapping("/product/details/{id}")
	public List<ProductStockInfoDTO> getProductMoreInfo(@PathVariable Long id){
		return service.getMoreProductInfo(id);
	}
	
	@PostMapping("/product")
	public ResponseEntity<ProductsDTO> addSalesman(@RequestBody ProductsDTO productsDTO){
		return ResponseEntity.ok().body(service.addProduct(productsDTO));
	}
	/*
    @DeleteMapping("/product/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        service.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }*/
}
