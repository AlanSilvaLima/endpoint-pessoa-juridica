package com.pessoa_juridica.cadastro.repository;


import com.pessoa_juridica.cadastro.model.PessoaJuridica;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PessoaJuridicaRepository extends JpaRepository<PessoaJuridica, Long> {
    Optional<PessoaJuridica> findByCnpj(String cnpj);
    Optional<PessoaJuridica> findByCpfResponsavel(String cpfResponsavel);
    Optional<PessoaJuridica> findByEmail(String email);
}
