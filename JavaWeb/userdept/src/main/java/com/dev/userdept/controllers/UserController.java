package com.dev.userdept.controllers;

import java.util.List;

import com.dev.userdept.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.dev.userdept.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired//injecao de dependencia
    private UserRepository repository;

    @GetMapping//requisicao do verbo http get
    public List<User> findAll(){
        List<User> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")//requisicao do verbo http get
    public User findById(@PathVariable Long id){
        User result = repository.findById(id).get();
        return result;
    }

    @PostMapping
    public User insert(@RequestBody User user){
        User result = repository.save(user);
        return result;
    }

}
