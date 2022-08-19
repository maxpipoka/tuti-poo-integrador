package com.pootuti.integrador.models;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer extends User {
    
    @Column(nullable= false)
    private Calendar joinDate;

    public Customer(){

    }

    public Customer(Long idUser, String names, String surnames, Calendar birthDate, Gender gender, Calendar joinDate) {
        super(idUser, names, surnames, birthDate, gender);
        this.joinDate = joinDate;
    }

    public Calendar getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Calendar joinDate) {
        this.joinDate = joinDate;
    }

    
}
