package com.pessoa_juridica.cadastro.repository;


import com.pessoa_juridica.cadastro.model.PessoaJuridica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaJuridicaRepository extends JpaRepository<PessoaJuridica, Long> {
}
