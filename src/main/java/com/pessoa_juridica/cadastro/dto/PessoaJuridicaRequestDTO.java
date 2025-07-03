package com.pessoa_juridica.cadastro.dto;

import com.pessoa_juridica.cadastro.model.PessoaJuridica;
import jakarta.validation.constraints.AssertTrue;
import lombok.Data;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Data
public class PessoaJuridicaRequestDTO {

    @NotBlank
    private String cnpj;

    @NotBlank
    private String cpfResponsavel;

    @NotBlank(message = "O nome não deve estar em branco")
    private String nome;

    @NotBlank(message = "O celular não deve estar em branco")
    private String celular;

    private String telefone;

    @NotBlank(message = "O e-mail não deve estar em branco")
    @Email
    private String email;

    @NotBlank(message = "A confirmação de e-mail não deve estar em branco")
    @Email
    private String confirmarEmail;

    @NotBlank(message = "O CEP não deve estar em branco")
    private String cep;

    @NotBlank(message = "O logradouro não deve estar em branco")
    private String logradouro;

    @NotBlank(message = "O número não deve estar em branco")
    private String numero;

    private String complemento;

    @NotBlank(message = "A cidade não deve estar em branco")
    private String cidade;

    @NotBlank(message = "O bairro não deve estar em branco")
    private String bairro;

    @NotBlank(message = "O estado não deve estar em branco")
    private String estado;

    @AssertTrue(message = "E-mails não coincidem")
    public boolean isEmailsIguais() {
        return email != null && email.equals(confirmarEmail);
    }

    public PessoaJuridica toEntity() {
        PessoaJuridica pj = new PessoaJuridica();
        pj.setCnpj(this.cnpj);
        pj.setCpfResponsavel(this.cpfResponsavel);
        pj.setNome(this.nome);
        pj.setCelular(this.celular);
        pj.setTelefone(this.telefone);
        pj.setEmail(this.email);
        pj.setConfirmarEmail(this.confirmarEmail);
        pj.setCep(this.cep);
        pj.setLogradouro(this.logradouro);
        pj.setNumero(this.numero);
        pj.setComplemento(this.complemento);
        pj.setCidade(this.cidade);
        pj.setBairro(this.bairro);
        pj.setEstado(this.estado);
        return pj;
    }
}
