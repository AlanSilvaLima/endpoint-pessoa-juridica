package com.pessoa_juridica.cadastro.controller;


import com.pessoa_juridica.cadastro.model.PessoaJuridica;
import com.pessoa_juridica.cadastro.service.PessoaJuridicaService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/pessoas-juridicas"})
public class PessoaJuridicaController {
    private final PessoaJuridicaService service;

    public PessoaJuridicaController(PessoaJuridicaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<PessoaJuridica> cadastrar(@RequestBody @Valid PessoaJuridica pj) {
        return ResponseEntity.ok(this.service.salvar(pj));
    }
}
