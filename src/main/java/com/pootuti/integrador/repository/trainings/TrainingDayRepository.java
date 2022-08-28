package com.pootuti.integrador.repository.trainings;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pootuti.integrador.models.trainings.TrainingDay;

@Repository
public interface TrainingDayRepository extends JpaRepository<TrainingDay, Long>{
    
}
