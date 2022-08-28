package com.pootuti.integrador.repository.trainings;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pootuti.integrador.models.trainings.TrainingWeek;

@Repository
public interface TrainingWeekRepository extends JpaRepository<TrainingWeek, Long>{
    
}
