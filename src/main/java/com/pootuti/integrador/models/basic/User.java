package com.pootuti.integrador.models.basic;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

@MappedSuperclass
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    @Column(nullable = false)
    private String names;

    @Column(nullable = false)
    private String surnames;

    @Column(nullable = false)
    private Calendar birthDate;

    // @Column(nullable = false)
    @ManyToOne
    @JoinColumn(name = "idGender")
    private Gender gender;

    public User() {
    }

    public User(Long idUser, String names, String surnames, Calendar birthDate, Gender gender) {
        this.idUser = idUser;
        this.names = names;
        this.surnames = surnames;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    
}
