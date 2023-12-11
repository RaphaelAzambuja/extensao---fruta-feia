package com.example.extensao.extensao.resource;

import com.example.extensao.extensao.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/instituicao")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public Instituicao createInstituicao(@RequestBody Instituicao instituicao) {
        return usuarioService.saveInstituicao(instituicao);
    }

    @GetMapping
    public List<Instituicao> getInstituicaoList() {
        return usuarioService.findAll();
    }

    @GetMapping("/{idInstituicao}")
    public ResponseEntity<Instituicao> getInstituicaoByID(@PathVariable("idInstituicao") Long idInstituicao) throws Exception {
        return ResponseEntity.ok(usuarioService.getById(idInstituicao).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }

    @PutMapping("/{idInstituicao}")
    public Instituicao updateInstituicao(@RequestBody Instituicao instituicao) {
        return usuarioService.updateInstituicao(instituicao);
    }

    @DeleteMapping("/{idInstituicao}")
    public ResponseEntity deleteById(@PathVariable("idInstituicao") Long idInstituicao) throws Exception {
        try {
            usuarioService.deleteInstituicao(idInstituicao);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Instituicao>) ResponseEntity.ok();
    }

}
