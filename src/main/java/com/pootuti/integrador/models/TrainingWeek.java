package com.pootuti.integrador.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TrainingWeek {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTrainingWeek;

    @Column(nullable = false)
    private String name;

    @Column(name="trainingDays", nullable = false)
    @ElementCollection(targetClass= TrainingDay.class)
    private List<TrainingDay> trainingDays;

    public TrainingWeek(){

    }

    public TrainingWeek(Long idTrainingWeek, String name, List<TrainingDay> trainingDays) {
        this.idTrainingWeek = idTrainingWeek;
        this.name = name;
        this.trainingDays = trainingDays;
    }

    public Long getIdTrainingWeek() {
        return idTrainingWeek;
    }

    public void setIdTrainingWeek(Long idTrainingWeek) {
        this.idTrainingWeek = idTrainingWeek;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TrainingDay> getTrainingDays() {
        return trainingDays;
    }

    public void setTrainingDays(List<TrainingDay> trainingDays) {
        this.trainingDays = trainingDays;
    }

    
}
