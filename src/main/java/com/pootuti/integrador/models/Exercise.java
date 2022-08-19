package com.pootuti.integrador.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="exercises")
public class Exercise {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idExercise;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Musclegroup muscleGroup;

    @Column(nullable = false)
    private Long series;

    @Column(nullable = false)
    private Long repetitions;

    @Column(nullable = false)
    private Long weight; 

    public Exercise(){

    }

    public Exercise(Long idExercise, String name, Musclegroup muscleGroup, Long series, Long repetitions, Long weight) {
        this.idExercise = idExercise;
        this.name = name;
        this.muscleGroup = muscleGroup;
        this.series = series;
        this.repetitions = repetitions;
        this.weight = weight;
    }

    public Long getIdExercise() {
        return idExercise;
    }

    public void setIdExercise(Long idExercise) {
        this.idExercise = idExercise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Musclegroup getMuscleGroup() {
        return muscleGroup;
    }

    public void setMuscleGroup(Musclegroup muscleGroup) {
        this.muscleGroup = muscleGroup;
    }

    public Long getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(Long repetitions) {
        this.repetitions = repetitions;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public Long getSeries() {
        return series;
    }

    public void setSeries(Long series) {
        this.series = series;
    }

    

}

