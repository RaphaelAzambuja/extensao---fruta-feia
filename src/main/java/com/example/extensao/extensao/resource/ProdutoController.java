package com.example.extensao.extensao.resource;

import com.example.extensao.extensao.model.Produto;
import com.example.extensao.extensao.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/produto")
public class ProdutoController extends AbstractController {

    @Autowired
    ProdutoService produtoService;

    @PostMapping
    public Produto createProduto(@RequestBody Produto produto) {
        return produtoService.saveProduto(produto);
    }

    @GetMapping
    public List<Produto> getProdutoList() {
        return produtoService.findAll();
    }

    @GetMapping("{idProduto}")
    public ResponseEntity<Produto> getProdutoByID(@PathVariable("idProduto") Long idProduto) throws Exception {
        return ResponseEntity.ok(produtoService.getById(idProduto).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }

    @PutMapping("{idProduto}")
    public Produto updateProduto(@RequestBody Produto produto) {
        return produtoService.updateProduto(produto);
    }

    @DeleteMapping("{idProduto}")
    public ResponseEntity deleteById(@PathVariable("idProduto") Long idProduto) throws Exception {
        try {
            produtoService.deleteProduto(idProduto);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ResponseEntity.noContent().build();
    }

}
