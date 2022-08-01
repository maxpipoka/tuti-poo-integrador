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
public class Client {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idClient;

    @Column(nullable = false)
    private String surnames;

    @Column(nullable = false)
    private String names;

    @Column(nullable = false)
    private Calendar birdhDate;

    @Column(nullable = false)
    private Genre genre;

    @Column(nullable = false)
    private Calendar joinDate;

    public Client(){

    }

    public Client(Long idClient, String surnames, String names, Calendar birdhDate, Genre genre, Calendar joinDate) {
        this.idClient = idClient;
        this.surnames = surnames;
        this.names = names;
        this.birdhDate = birdhDate;
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

    public Calendar getBirdhDate() {
        return birdhDate;
    }

    public void setBirdhDate(Calendar birdhDate) {
        this.birdhDate = birdhDate;
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
