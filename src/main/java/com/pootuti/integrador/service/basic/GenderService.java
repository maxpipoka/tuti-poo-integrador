package com.pootuti.integrador.service.basic;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pootuti.integrador.models.basic.Gender;
import com.pootuti.integrador.repository.basic.GenderRepository;

@Service
public class GenderService implements IGenderService {

    private GenderRepository genderRepository;

    @Override
    public void deleteGender(Long idGender) {
        genderRepository.deleteById(idGender);
        
    }

    @Override
    public Gender findGender(Long idGender) {
        Gender findedGender = genderRepository.findById(idGender).orElse(null);
        return findedGender;
    }

    @Override
    public List<Gender> getGenders() {
        return genderRepository.findAll();
    }

    @Override
    public void saveGender(Gender gender) {
        genderRepository.save(gender);
        
    }

    
    
}
