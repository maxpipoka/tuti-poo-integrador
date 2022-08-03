package com.pootuti.integrador.models;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idClient;

    @Column(nullable = false)
    private String surnames;

    @Column(nullable = false)
    private String names;

    @Column(nullable = false)
    private Calendar birthDate;

    @Column(nullable = false)
    private Genre genre;

    @Column(nullable = false)
    private Calendar joinDate;

    public Customer(){

    }

    public Customer(Long idClient, String surnames, String names, Calendar birthDate, Genre genre, Calendar joinDate) {
        this.idClient = idClient;
        this.surnames = surnames;
        this.names = names;
        this.birthDate = birthDate;
        this.genre = genre;
        this.joinDate = joinDate;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Calendar birdhDate) {
        this.birthDate = birdhDate;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Calendar getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Calendar joinDate) {
        this.joinDate = joinDate;
    }

}
