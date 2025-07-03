package com.pessoa_juridica.cadastro.service;


import com.pessoa_juridica.cadastro.dto.PessoaJuridicaRequestDTO;
import com.pessoa_juridica.cadastro.model.PessoaJuridica;
import com.pessoa_juridica.cadastro.repository.PessoaJuridicaRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class PessoaJuridicaService {
    private final PessoaJuridicaRepository repository;

    public PessoaJuridicaService(PessoaJuridicaRepository repository) {
        this.repository = repository;
    }

    public PessoaJuridica salvar(PessoaJuridicaRequestDTO dto) {
        if (repository.findByCnpj(dto.getCnpj()).isPresent()) {
            throw new DataIntegrityViolationException("CNPJ já cadastrado.");
        }

        if (repository.findByCpfResponsavel(dto.getCpfResponsavel()).isPresent()) {
            throw new DataIntegrityViolationException("CPF do responsável já cadastrado.");
        }

        if (repository.findByEmail(dto.getEmail()).isPresent()) {
            throw new DataIntegrityViolationException("E-mail já cadastrado.");
        }

        PessoaJuridica pj = dto.toEntity();
        return repository.save(pj);
    }
}
