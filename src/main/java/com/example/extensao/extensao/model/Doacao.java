package com.example.extensao.extensao.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.time.LocalDate;
@Entity
public class Doacao extends EntityId {
    @Column(name = "tipo", nullable = false)
    private String tipo;
    @Column(name = "quantidade", nullable = false)
    private Integer quantidade;
    @Column(name = "disponibilidade", nullable = false)
    private String disponibilidade;
    @Column(name = "validade", nullable = false)
    private LocalDate validade;

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

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    @Override
    public String toString() {
        return "Doacao{" +
                "tipo='" + tipo + '\'' +
                ", quantidade=" + quantidade +
                ", disponibilidade='" + disponibilidade + '\'' +
                ", validade=" + validade +
                '}';
    }
}
