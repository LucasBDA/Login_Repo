package com.login.sales.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.login.sales.entities.Products;

public interface ProductsRepository extends JpaRepository<Products, Long>{
    @Query(value = "SELECT b.name, " +
               "b.sku, " +
               "a.type, " +
               "a.type_desc, " +
               "b.price AS price_unit, " +
               "b.price * a.amount AS total_sale_potential, " +
               "a.cost AS cost_unit, " +
               "a.cost * a.amount AS total_cost, " +
               "a.supplier " +
               "FROM stock a " +
               "JOIN products b ON a.id_product = b.id " +
               "WHERE b.id = :id " +
               "GROUP BY b.name, b.sku, a.type, a.type_desc, b.price, a.cost, a.supplier",
        nativeQuery = true)
    List<Object[]> findMoreInformationById(@Param("id") long id);
    //Coleta informações de estoque de um determinado produto
}
