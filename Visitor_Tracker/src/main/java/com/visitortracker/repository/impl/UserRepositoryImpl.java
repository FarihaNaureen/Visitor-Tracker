package com.visitortracker.repository.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.visitortracker.model.Users;
import com.visitortracker.repository.UserRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Users findByUsernameAndPassword(
            String username,
            String password) {

        try {

            return entityManager.createQuery(
                    "FROM Users WHERE username=:username AND password=:password",
                    Users.class)
                    .setParameter("username", username)
                    .setParameter("password", password)
                    .getSingleResult();

        } catch(Exception e) {
            return null;
        }
    }

    @Override
    public void save(Users user) {
        entityManager.persist(user);
        entityManager.flush();
    }
}