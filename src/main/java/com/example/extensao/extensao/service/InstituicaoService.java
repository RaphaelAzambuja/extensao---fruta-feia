package com.example.extensao.extensao.service;

import com.example.extensao.extensao.model.Instituicao;
import com.example.extensao.extensao.repository.InstituicaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class InstituicaoService {
    InstituicaoRepository instituicaoRepository;

    @Autowired
    public InstituicaoService(InstituicaoRepository instituicaoRepository){
        this.instituicaoRepository = instituicaoRepository;
    }

    public Instituicao saveInstituicao(Instituicao instituicao){
        return instituicaoRepository.save(instituicao);
    }

    public List<Instituicao> findAll(){
        return instituicaoRepository.findAll();
    }

    public Optional<Instituicao> getById(Long idInstituicao){return instituicaoRepository.findById(idInstituicao);}

    public Instituicao updateInstituicao(Instituicao instituicao){
        return instituicaoRepository.save(instituicao);
    }

    public void deleteInstituicao(Long idInstituicao){instituicaoRepository.deleteById(idInstituicao);}

}
