package com.pootuti.integrador.repository.basic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pootuti.integrador.models.basic.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
    
}
