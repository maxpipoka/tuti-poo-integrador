package com.pootuti.integrador.repository.basic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pootuti.integrador.models.basic.Gender;

@Repository
public interface GenderRepository extends JpaRepository<Gender, Long>{
    
}
