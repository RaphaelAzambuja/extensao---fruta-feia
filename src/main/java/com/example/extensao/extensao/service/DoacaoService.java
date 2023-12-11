package com.example.extensao.extensao.service;

import com.example.extensao.extensao.model.Doacao;
import com.example.extensao.extensao.repository.DoacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoacaoService {
    DoacaoRepository doacaoRepository;

    @Autowired
    public DoacaoService(DoacaoRepository doacaoRepository){
        this.doacaoRepository = doacaoRepository;
    }

    public Doacao saveDoacao(Doacao doacao){
        return doacaoRepository.save(doacao);
    }

    public List<Doacao> findAll(){
        return doacaoRepository.findAll();
    }

    public Optional<Doacao> getById(Long idDoacao){return doacaoRepository.findById(idDoacao);}

    public Doacao updateDoacao(Doacao doacao){
        return doacaoRepository.save(doacao);
    }

    public void deleteDoacao(Long idDoacao){
        doacaoRepository.deleteById(idDoacao);}

}
