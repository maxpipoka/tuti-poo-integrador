package com.pootuti.integrador.models.trainings;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="muscle_groups")
public class MuscleGroup{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idMuscleGroup;

    @Column(nullable = false)
    private String name;

    public MuscleGroup() {
    }

    public MuscleGroup(Long idMuscleGroup, String name) {
        this.idMuscleGroup = idMuscleGroup;
        this.name = name;
    }

}
