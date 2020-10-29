package com.example.springbootapp.repository;

import java.util.List;

import com.example.springbootapp.config.User;


public interface UserRepository {

    void save(User user);
    List<User> findAll();
    User findById(String id);
    void update(User user);
    void delete(String id);


}
