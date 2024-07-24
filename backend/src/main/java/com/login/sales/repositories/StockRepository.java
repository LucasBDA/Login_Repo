package com.login.sales.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.login.sales.entities.Stock;

public interface StockRepository extends JpaRepository<Stock, Long> {

    @Query(value = "SELECT * FROM stock WHERE id_product = :id", nativeQuery = true)
    List<Stock> findByProduct_Id(@Param("id") long idProduct);
    
}
