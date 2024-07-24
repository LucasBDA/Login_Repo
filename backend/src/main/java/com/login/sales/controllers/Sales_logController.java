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

import com.login.sales.entities.dto.Sales_logDTO;
import com.login.sales.services.Sales_logService;

@Controller
@RestController
public class Sales_logController {
	@Autowired
	private Sales_logService service;
	
	@GetMapping("/sales_log/{id}")
	public Sales_logDTO getById(@PathVariable Long id){
		return service.findById(id);
	}

    @GetMapping("/sales_log")
	public List<Sales_logDTO> getAllInSales_log(){
		return service.findAll();
	}

	@PostMapping("/sales_log")
	public ResponseEntity<Sales_logDTO> addProductInSales_log(@RequestBody Sales_logDTO sales_logDTO){
		return ResponseEntity.ok().body(service.newSale(sales_logDTO));
	}
	
}