package com.pessoa_juridica.cadastro.controller;


import com.pessoa_juridica.cadastro.dto.PessoaJuridicaRequestDTO;
import com.pessoa_juridica.cadastro.dto.PessoaJuridicaResponseDTO;
import com.pessoa_juridica.cadastro.model.PessoaJuridica;
import com.pessoa_juridica.cadastro.service.PessoaJuridicaService;
import jakarta.validation.Valid;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<?> cadastrar(@RequestBody @Valid PessoaJuridicaRequestDTO dto) {
        try {
            PessoaJuridica entity = service.salvar(dto);
            PessoaJuridicaResponseDTO response = new PessoaJuridicaResponseDTO(
                    entity.getId(),
                    entity.getCnpj(),
                    entity.getNome(),
                    entity.getEmail(),
                    entity.getCidade(),
                    entity.getEstado()
            );
            return ResponseEntity.ok(response);
        } catch (DataIntegrityViolationException ex) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
        }
    }
}
