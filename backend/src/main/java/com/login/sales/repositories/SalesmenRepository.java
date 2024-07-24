package com.login.sales.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.login.sales.entities.Salesmen;

public interface SalesmenRepository extends JpaRepository<Salesmen, Long>{
    @Query(value = "SELECT b.name AS salesman_name, " +
               "c.name AS product_name, " +
               "c.price, " +
               "a.amount_sold, " +
               "c.price * a.amount_sold AS total_sold " +
               "FROM sales_log a " +
               "JOIN salesmen b ON a.id_salesman = b.id " +
               "JOIN products c ON a.id_product = c.id " +
               "WHERE a.id_salesman = :id " +
               "GROUP BY b.name, c.name, c.price, a.amount_sold", 
        nativeQuery = true)
    List<Object[]> getSales(@Param("id") long id); 
    //Retorna lista de vendas de um vendedor
}
