package com.login.sales.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.login.sales.entities.Costumers;

public interface CostumersRepository extends JpaRepository<Costumers, Long>{
}
