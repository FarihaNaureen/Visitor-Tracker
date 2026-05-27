package com.visitortracker.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.visitortracker.model.Users;
import com.visitortracker.repository.UserRepository;
import com.visitortracker.service.UserService;



@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public Users login(String username,String password) {
        return repository.findByUsernameAndPassword(username,password);
    }

    @Override
    public void register(Users user) {
        repository.save(user);
    }
}