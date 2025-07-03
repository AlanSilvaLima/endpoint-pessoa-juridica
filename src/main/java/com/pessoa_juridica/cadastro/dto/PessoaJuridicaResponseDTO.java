package com.pessoa_juridica.cadastro.dto;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
public class PessoaJuridicaResponseDTO {

    private Long id;
    private String cnpj;
    private String nome;
    private String email;
    private String cidade;
    private String estado;

    public PessoaJuridicaResponseDTO(Long id, String cnpj, String nome, String email, String cidade, String estado) {
        this.id = id;
        this.cnpj = cnpj;
        this.nome = nome;
        this.email = email;
        this.cidade = cidade;
        this.estado = estado;
    }
}
