package com.narcieliton.controller;

import com.narcieliton.dto.UserDto;
import com.narcieliton.entity.User;
import com.narcieliton.service.HelloSpringService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
public class HelloController {

    @ManagedProperty("#{helloSpringService}")
    private HelloSpringService helloSpringService;

    private User user;

    public String getMensagem(){
        return helloSpringService.getMensagem();
    }

    public List<UserDto> listar(){
        List<User> users = helloSpringService.listar();


        List<UserDto> lista = new ArrayList<>();
            users.forEach(user -> {
                UserDto dto = new UserDto();
                dto.setId(user.getId());
                dto.setNome(user.getNome());

                lista.add(dto);
            });
        return lista;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public HelloSpringService getHelloSpringService() {
        return helloSpringService;
    }

    public void setHelloSpringService(HelloSpringService helloSpringService) {
        this.helloSpringService = helloSpringService;
    }
}
