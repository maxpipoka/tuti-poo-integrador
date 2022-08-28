package com.pootuti.integrador.service.basic;

import java.util.List;

import com.pootuti.integrador.models.basic.User;

public interface IUserService {
    
    public void saveUser(User user);

    public User findUser(Long idUser);

    public void deleteUse(Long idUser);

    public List<User> getUsers();
}
