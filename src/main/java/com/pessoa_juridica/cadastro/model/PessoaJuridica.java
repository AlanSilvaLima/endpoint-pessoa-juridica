package com.pessoa_juridica.cadastro.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pessoa_juridica")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaJuridica {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    @NotBlank
    private String cnpj;
    @NotBlank
    private String cpfResponsavel;
    @NotBlank
    private String nome;
    @NotBlank
    private String celular;
    @NotBlank
    private String telefone;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    @Email
    private String confirmarEmail;
    @NotBlank
    private String cep;
    @NotBlank
    private  String logradouro;
    @NotBlank
    private String numero;
    private String complemento;
    @NotBlank
    private String cidade;
    @NotBlank
    private String bairro;
    @NotBlank
    private String estado;
}
