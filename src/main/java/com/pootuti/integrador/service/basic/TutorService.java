package com.pootuti.integrador.service.basic;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pootuti.integrador.models.basic.Tutor;
import com.pootuti.integrador.repository.basic.TutorRepository;

@Service
public class TutorService implements ITutorService{

    private TutorRepository tutorRepository;

    @Override
    public void deleteTutor(Long idUser) {
        tutorRepository.deleteById(idUser);
    }

    @Override
    public Tutor findTutor(Long idUser) {
        Tutor findedTutor = tutorRepository.findById(idUser).orElse(null);
        return findedTutor;
    }

    @Override
    public List<Tutor> getTutors() {
        return tutorRepository.findAll();
    }

    @Override
    public void saveTutor(Tutor tutor) {
        tutorRepository.save(tutor);
        
    }

    
    
}
