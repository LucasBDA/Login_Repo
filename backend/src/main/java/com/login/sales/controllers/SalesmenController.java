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

import com.login.sales.entities.dto.SalesInfoDTO;
import com.login.sales.entities.dto.SalesmenDTO;
import com.login.sales.services.SalesmenService;

@Controller
@RestController
public class SalesmenController {
	@Autowired
	private SalesmenService service;
	
	@GetMapping("/salesman/{id}")
	public SalesmenDTO getSalesmanById(@PathVariable Long id){
		return service.findById(id);
	}

    @GetMapping("/salesman")
	public List<SalesmenDTO> getAllSalesmen(){
		return service.findAll();
	}
	
	@GetMapping("/salesman/{id}/sales")
	public List<SalesInfoDTO> getSalesOfASalesman(@PathVariable Long id){
		return service.getSalesOfASalesman(id);
	}
	
	@PostMapping("/salesman")
	public ResponseEntity<SalesmenDTO> addSalesman(@RequestBody SalesmenDTO salesmenDTO){
		return ResponseEntity.ok().body(service.addSalesman(salesmenDTO));
	}
/*
	@DeleteMapping("/salesman/{id}")
    public ResponseEntity<Void> deleteSalesman(@PathVariable Long id) {
        service.deleteSalesman(id);
        return ResponseEntity.noContent().build();
    }*/
	
}
