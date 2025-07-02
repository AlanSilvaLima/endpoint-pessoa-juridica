package com.pessoa_juridica.cadastro.service;


import com.pessoa_juridica.cadastro.model.PessoaJuridica;
import com.pessoa_juridica.cadastro.repository.PessoaJuridicaRepository;
import org.springframework.stereotype.Service;

@Service
public class PessoaJuridicaService {
    private final PessoaJuridicaRepository repository;

    public PessoaJuridicaService(PessoaJuridicaRepository repository) {
        this.repository = repository;
    }

    public PessoaJuridica salvar(PessoaJuridica pj) {
        return (PessoaJuridica)this.repository.save(pj);
    }
}
