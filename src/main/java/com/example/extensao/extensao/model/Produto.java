package com.example.extensao.extensao.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Produto {
    @Column(name = "nome_produto", nullable = false)
    private String nome;
    @Column(name = "tipo", nullable = false)
    private String tipo;
    @Column(name = "quantidade", nullable = false)
    private Integer quantidade;
    @Column(name = "disponibilidade", nullable = false)
    private String disponibilidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
