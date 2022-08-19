package com.pootuti.integrador.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trainingdays")
public class TrainingDay {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTrainingDay;

    @Column(nullable = false)
    private String name;

    @Column(name = "exercises", nullable = false)
    @ElementCollection(targetClass = Exercise.class)
    private List<Exercise> exercises;

    public TrainingDay(){

    }

    public TrainingDay(Long idTrainingDay, String name, List<Exercise> exercises) {
        this.idTrainingDay = idTrainingDay;
        this.name = name;
        this.exercises = exercises;
    }

    public Long getIdTrainingDay() {
        return idTrainingDay;
    }

    public void setIdTrainingDay(Long idTrainingDay) {
        this.idTrainingDay = idTrainingDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    

}
