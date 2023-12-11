package com.example.extensao.extensao.repository;

import com.example.extensao.extensao.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
