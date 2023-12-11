package com.example.extensao.extensao.service;

import com.example.extensao.extensao.model.Produto;
import com.example.extensao.extensao.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public Produto saveProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }

    public Optional<Produto> getById(Long idProduto){return produtoRepository.findById(idProduto);}

    public Produto updateProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public void deleteProduto(Long idProduto){produtoRepository.deleteById(idProduto);}

}
