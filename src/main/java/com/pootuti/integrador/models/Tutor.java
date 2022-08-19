package com.pootuti.integrador.models;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tutors")
public class Tutor extends User{
    
    @Column(nullable = false)
    private Calendar hiringDate;

    public Tutor(){

    }

    public Tutor(Long idUser, String names, String surnames, Calendar birthDate, Gender gender, Calendar hiringDate) {
        super(idUser, names, surnames, birthDate, gender);
        this.hiringDate = hiringDate;
    }

    public Calendar getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(Calendar hiringDate) {
        this.hiringDate = hiringDate;
    }

}
