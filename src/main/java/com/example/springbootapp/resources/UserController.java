package com.example.springbootapp.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import com.example.springbootapp.model.User;

@RestController
public class UserController {

    @GetMapping("users")
    public ResponseEntity getUsers() {
        User user = new User("dilip","Dilip","Kaushalye","dilip@gmail.com");
        List<User> users = Arrays.asList(user);
        return new ResponseEntity(users, HttpStatus.OK);
    }


}
