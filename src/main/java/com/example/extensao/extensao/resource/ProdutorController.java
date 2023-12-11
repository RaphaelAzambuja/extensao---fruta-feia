package com.example.extensao.extensao.resource;

import com.example.extensao.extensao.model.Produtor;
import com.example.extensao.extensao.service.ProdutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/produtor")
public class ProdutorController {

    @Autowired
    ProdutorService produtorService;

    @PostMapping
    public Produtor createProdutor(@RequestBody Produtor produtor) {
        return produtorService.saveProdutor(produtor);
    }

    @GetMapping
    public List<Produtor> getProdutorList() {
        return produtorService.findAll();
    }

    @GetMapping("/{idProdutor}")
    public ResponseEntity<Produtor> getProdutorByID(@PathVariable("idProdutor") Long idProdutor) throws Exception {
        return ResponseEntity.ok(produtorService.getById(idProdutor).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }

    @PutMapping("/{idProdutor}")
    public Produtor updateProdutor(@RequestBody Produtor produtor) {
        return produtorService.updateProdutor(produtor);
    }

    @DeleteMapping("/{idProdutor}")
    public ResponseEntity deleteById(@PathVariable("idProdutor") Long idProdutor) throws Exception {
        try {
            produtorService.deleteProdutor(idProdutor);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Produtor>) ResponseEntity.ok();
    }

}
