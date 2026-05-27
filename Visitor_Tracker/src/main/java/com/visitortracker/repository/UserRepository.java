package com.visitortracker.repository;

import com.visitortracker.model.Users;

public interface UserRepository {

    Users findByUsernameAndPassword(
            String username,
            String password);

    void save(Users user);

}