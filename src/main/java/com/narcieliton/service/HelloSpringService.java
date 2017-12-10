package com.narcieliton.service;

import com.narcieliton.entity.User;
import com.narcieliton.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloSpringService {

    @Autowired
    private UserRepository repository;

    public String getMensagem(){
        return "Olá spring e jsf";
    }

    public List<User> listar(){

        return repository.findAll();
    }
}
