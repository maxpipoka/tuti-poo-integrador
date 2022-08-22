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
@Table(name = "trainings")
public class Training {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTraining;

    @Column(nullable = true)
    private String name;

    @Column(nullable = true)
    private Customer customer;

    @Column(nullable = true)
    private Tutor tutor;

    @Column(nullable = true)
    private Long startWeek;

    @Column(name="trainingWeek", nullable = false)
    @ElementCollection(targetClass= TrainingWeek.class)
    private List<TrainingWeek> trainingWeek;

    public Training(){
    }

    public Training(Long idTraining, String name, Customer customer, Tutor tutor, Long startWeek,
            List<TrainingWeek> trainingWeek) {
        this.idTraining = idTraining;
        this.name = name;
        this.customer = customer;
        this.tutor = tutor;
        this.startWeek = startWeek;
        this.trainingWeek = trainingWeek;
    }

    public Long getIdTraining() {
        return idTraining;
    }

    public void setIdTraining(Long idTraining) {
        this.idTraining = idTraining;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public Long getStartWeek() {
        return startWeek;
    }

    public void setStartWeek(Long startWeek) {
        this.startWeek = startWeek;
    }

    public List<TrainingWeek> getTrainingWeek() {
        return trainingWeek;
    }

    public void setTrainingWeek(List<TrainingWeek> trainingWeek) {
        this.trainingWeek = trainingWeek;
    }

}
