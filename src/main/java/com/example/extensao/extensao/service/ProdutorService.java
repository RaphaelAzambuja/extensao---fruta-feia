package com.example.extensao.extensao.service;

import com.example.extensao.extensao.model.Produtor;
import com.example.extensao.extensao.repository.ProdutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutorService {
    ProdutorRepository produtorRepository;

    @Autowired
    public ProdutorService(ProdutorRepository produtorRepository){
        this.produtorRepository = produtorRepository;
    }

    public Produtor saveProdutor(Produtor produtor){
        return produtorRepository.save(produtor);
    }

    public List<Produtor> findAll(){
        return produtorRepository.findAll();
    }

    public Optional<Produtor> getById(Long idProdutor){return produtorRepository.findById(idProdutor);}

    public Produtor updateProdutor(Produtor produtor){
        return produtorRepository.save(produtor);
    }

    public void deleteProdutor(Long idProdutor){produtorRepository.deleteById(idProdutor);}

}
