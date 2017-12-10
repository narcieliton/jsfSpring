package com.narcieliton.dto;

import java.io.Serializable;

public class UserDto implements Serializable {

    private Long id;
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nome='" + nome;
    }
}
