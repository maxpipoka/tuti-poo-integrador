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
import com.pootuti.integrador.models.basic.User;
import com.pootuti.integrador.service.basic.IUserService;

@RestController
public class UserController {

    private IUserService userService;

    @GetMapping("/users/get")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @DeleteMapping("/users/delete/{idDelete}")
    public void deleteUser(@PathVariable Long idDelete){
        userService.deleteUser(idDelete);
    }

    @PostMapping("/users/save")
    public void saveUser(@RequestBody User user){
        userService.saveUser(user);
    }

    @GetMapping("/users/search/{idSearch}")
    public User findUser(@PathVariable Long idSearch){
        return userService.findUser(idSearch);
    }

    @PutMapping("/users/edit/{idUser}")
    public void editUser(@PathVariable Long idUser,
                            @RequestParam("names") String newNames,
                            @RequestParam("surnames") String newSurnames,
                            @RequestParam("birthDate") Calendar newBirthDate,
                            @RequestParam("gender") Gender newGender){
        User userToEdit = userService.findUser(idUser);
        
        userToEdit.setNames(newNames);
        userToEdit.setSurnames(newSurnames);
        userToEdit.setBirthDate(newBirthDate);
        userToEdit.setGender(newGender);

        userService.saveUser(userToEdit);
        }
    
}
