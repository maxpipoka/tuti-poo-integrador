package com.pootuti.integrador.service.basic;

import java.util.List;

import com.pootuti.integrador.models.basic.Tutor;

public interface ITutorService {
    public void saveTutor(Tutor tutor);

    public Tutor findTutor(Long idUser);

    public void deleteTutor(Long idUser);

    public List<Tutor> getTutors();
    
}
