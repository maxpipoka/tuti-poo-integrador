package com.pootuti.integrador.repository.basic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pootuti.integrador.models.basic.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
