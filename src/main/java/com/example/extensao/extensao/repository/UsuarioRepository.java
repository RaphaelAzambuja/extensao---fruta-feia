package com.example.extensao.extensao.repository;

import com.example.extensao.extensao.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
