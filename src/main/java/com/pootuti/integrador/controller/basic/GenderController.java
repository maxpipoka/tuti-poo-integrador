package com.pootuti.integrador.controller.basic;

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
import com.pootuti.integrador.service.basic.IGenderService;

@RestController
public class GenderController {

    private IGenderService genderService;

    @GetMapping("/genders/get")
    public List<Gender> getGenders(){
        return genderService.getGenders();
    }
    
    @PostMapping("/genders/save")
    public void saveGender(@RequestBody Gender gender){
        genderService.saveGender(gender);
    }

    @DeleteMapping(("/genders/delete/{idDelete}"))
    public void deleteGender(@PathVariable Long idDelete){
        genderService.deleteGender(idDelete);
    }

    @GetMapping("/genders/search/{idSearch}")
    public Gender findGender(@PathVariable Long idSearch){
        return genderService.findGender(idSearch);
    }

    @PutMapping("/genders/edit/{idGender}")
    public void editGender(@PathVariable Long idGender,
                            @RequestParam("genderName") String newGenderName){
        Gender genderToEdit = genderService.findGender(idGender);

        genderToEdit.setGenderName(newGenderName);

        genderService.saveGender(genderToEdit);
    }
}
