package com.example.extensao.extensao.resource;

import com.example.extensao.extensao.enterprise.ValidationException;
import com.example.extensao.extensao.model.Instituicao;
import com.example.extensao.extensao.service.InstituicaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/instituicao")
public class InstituicaoController{

    @Autowired
    InstituicaoService instituicaoService;

    @PostMapping
    public Instituicao createInstituicao(@RequestBody Instituicao instituicao) {
        return instituicaoService.saveInstituicao(instituicao);
    }

    @GetMapping
    public List<Instituicao> getInstituicaoList() {
        return instituicaoService.findAll();
    }

    @GetMapping("/{idInstituicao}")
    public ResponseEntity<Instituicao> getInstituicaoByID(@PathVariable("idInstituicao") Long idInstituicao) throws Exception {
        return ResponseEntity.ok(instituicaoService.getById(idInstituicao).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }

    @PutMapping("/{idInstituicao}")
    public Instituicao updateInstituicao(@RequestBody Instituicao instituicao) {
        return instituicaoService.updateInstituicao(instituicao);
    }

    @DeleteMapping("/{idInstituicao}")
    public ResponseEntity deleteById(@PathVariable("idInstituicao") Long idInstituicao) throws Exception {
        try {
            instituicaoService.deleteInstituicao(idInstituicao);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Instituicao>) ResponseEntity.ok();
    }

}
