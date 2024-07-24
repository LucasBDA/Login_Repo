package com.login.sales.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.sales.entities.Sales_log;

public interface Sales_logRepository extends JpaRepository<Sales_log, Long>{

    Optional<Sales_log> findBySaleId(long id);
    
}
