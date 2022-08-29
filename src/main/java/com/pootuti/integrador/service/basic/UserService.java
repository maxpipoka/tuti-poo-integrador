package com.pootuti.integrador.service.basic;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pootuti.integrador.models.basic.User;
import com.pootuti.integrador.repository.basic.UserRepository;

@Service
public class UserService implements IUserService{

    private UserRepository userRepository;

    @Override
    public void deleteUser(Long idUser) {
        userRepository.deleteById(idUser);
    }

    @Override
    public User findUser(Long idUser) {
        User findedUser = userRepository.findById(idUser).orElse(null);
        return findedUser;
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }
}
