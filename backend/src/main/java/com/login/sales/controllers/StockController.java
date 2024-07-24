package com.login.sales.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.login.sales.entities.dto.StockDTO;
import com.login.sales.services.StockService;

@Controller
@RestController
public class StockController {
	@Autowired
	private StockService service;
	
	@GetMapping("/stock/{id}")
	public StockDTO getById(@PathVariable Long id){
		return service.findById(id);
	}

    @GetMapping("/stock")
	public List<StockDTO> getAllInStock(){
		return service.findAll();
	}
    @GetMapping("/stock/product/{productId}")
	public List<StockDTO> findByProductId(@PathVariable long productId){
        return service.findByProductId(productId);
    }
	@PostMapping("/stock")
	public ResponseEntity<StockDTO> addProductInStock(@RequestBody StockDTO stockDTO){
		return ResponseEntity.ok().body(service.addToStock(stockDTO));
	}
	
}