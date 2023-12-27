package com.example.reactbootlogin.service;

import com.example.reactbootlogin.entity.User;
import com.example.reactbootlogin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUserApi(){

        return userRepository.findAll();
    }
}
