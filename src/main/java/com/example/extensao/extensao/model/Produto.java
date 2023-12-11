package com.example.extensao.extensao.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Produto extends EntityId {
    @Column(name = "nome_produto", nullable = false)
    private String nome;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
