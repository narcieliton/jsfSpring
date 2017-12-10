package com.narcieliton.service;

import com.narcieliton.entity.User;
import com.narcieliton.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class InicializarBancoService {

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void init(){
        System.out.println("****** Inicializando insert ******");

        {
            User user = new User();
            user.setNome("nome 1");
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setNome("nome 2");
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setNome("nome 3");
            userRepository.save(user);
        }
        System.out.println("****** Finalizando insert ******");
    }
}
