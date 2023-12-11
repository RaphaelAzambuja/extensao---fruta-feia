package com.example.extensao.extensao.service;

import com.example.extensao.extensao.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UsuarioService {
    UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public Instituicao saveInstituicao(Instituicao instituicao){
        return usuarioRepository.save(instituicao);
    }

    public List<Instituicao> findAll(){
        return usuarioRepository.findAll();
    }

    public Optional<Instituicao> getById(Long idInstituicao){return usuarioRepository.findById(idInstituicao);}

    public Instituicao updateInstituicao(Instituicao instituicao){
        return usuarioRepository.save(instituicao);
    }

    public void deleteInstituicao(Long idInstituicao){
        usuarioRepository.deleteById(idInstituicao);}

}
