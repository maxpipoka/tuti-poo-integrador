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
    private Long repetitions;
}
