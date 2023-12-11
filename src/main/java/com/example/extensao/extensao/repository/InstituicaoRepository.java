package com.example.extensao.extensao.repository;

import com.example.extensao.extensao.model.Instituicao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstituicaoRepository  extends JpaRepository<Instituicao, Long> {
}
