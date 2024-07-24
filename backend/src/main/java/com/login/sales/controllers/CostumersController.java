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

import com.login.sales.entities.dto.CostumersDTO;
import com.login.sales.services.CostumersService;

@Controller
@RestController
public class CostumersController {
	@Autowired
	private CostumersService service;
	
	@GetMapping("/costumer/{id}")
	public CostumersDTO getCostumerById(@PathVariable Long id){
		return service.findById(id);
	}

    @GetMapping("/costumer")
	public List<CostumersDTO> getAllCostumers(){
		return service.findAll();
	}
	
	@PostMapping("/costumer")
	public ResponseEntity<CostumersDTO> addCostumer(@RequestBody CostumersDTO costumersDTO){
		return ResponseEntity.ok().body(service.addCostumer(costumersDTO));
	}
/*
	@DeleteMapping("/costumer/{id}")
    public ResponseEntity<Void> deleteCostumer(@PathVariable Long id) {
        service.deleteCostumer(id);
        return ResponseEntity.noContent().build();
    }
	*/
}
