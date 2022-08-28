package com.pootuti.integrador.repository.basic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pootuti.integrador.models.basic.Tutor;

@Repository
public interface TutorRepository extends JpaRepository<Tutor, Long>{
    
}
