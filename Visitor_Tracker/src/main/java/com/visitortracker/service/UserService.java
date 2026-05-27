package com.visitortracker.service;

import com.visitortracker.model.Users;

public interface UserService {

    Users login(String username,String password);

    void register(Users user);

}