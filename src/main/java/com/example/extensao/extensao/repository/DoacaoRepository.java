package com.example.extensao.extensao.repository;

import com.example.extensao.extensao.model.Doacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoacaoRepository extends JpaRepository<Doacao, Long> {
}
