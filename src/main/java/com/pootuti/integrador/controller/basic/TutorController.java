package com.pootuti.integrador.controller.basic;

import java.util.Calendar;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pootuti.integrador.models.basic.Gender;
import com.pootuti.integrador.models.basic.Tutor;
import com.pootuti.integrador.service.basic.ITutorService;

@RestController
public class TutorController {

    private ITutorService tutorService;

    @GetMapping("/tutors/get")
    public List<Tutor> getTutors(){
        return tutorService.getTutors();
    }

    @PostMapping("/tutors/save")
    public void saveTutor(@RequestBody Tutor tutor){
        tutorService.saveTutor(tutor);
    }

    @DeleteMapping("/tutors/delete/{idDelete}")
    public void deleteTutor(@PathVariable Long idDelete){
        tutorService.deleteTutor(idDelete);
    }

    @GetMapping("/tutors/search/{idSearch}")
    public Tutor findTutor(@PathVariable Long idSearch){
        return tutorService.findTutor(idSearch);
    }
    
    @PutMapping("/tutors/edit/{idTutor}")
    public void editTutor(@PathVariable Long idTutor,
                            @RequestParam("names") String newNames,
                            @RequestParam("surnames") String newSurnames,
                            @RequestParam("birthDate") Calendar newBirthDate,
                            @RequestParam("gender") Gender newGender,
                            @RequestParam("hiringDate") Calendar newHringDate){
    
        Tutor tutorToEdit = tutorService.findTutor(idTutor);
        
        tutorToEdit.setNames(newNames);
        tutorToEdit.setSurnames(newSurnames);
        tutorToEdit.setBirthDate(newBirthDate);
        tutorToEdit.setGender(newGender);
        tutorToEdit.setHiringDate(newHringDate);

        tutorService.saveTutor(tutorToEdit);
    }
}
