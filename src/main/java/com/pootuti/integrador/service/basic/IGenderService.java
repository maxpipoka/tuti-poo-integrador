package com.pootuti.integrador.service.basic;

import java.util.List;

import com.pootuti.integrador.models.basic.Gender;

public interface IGenderService {
    public void saveGender(Gender gender);

    public Gender findGender(Long idGender);

    public void deleteGender(Long idGender);

    public List<Gender> getGenders();
}
