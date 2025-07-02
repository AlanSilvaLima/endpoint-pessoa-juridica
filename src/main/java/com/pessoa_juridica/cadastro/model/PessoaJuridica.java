package com.pessoa_juridica.cadastro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
public class PessoaJuridica {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private @NotBlank String cnpj;
    private @NotBlank String cpfResponsavel;
    private @NotBlank String nome;
    private @NotBlank String celular;
    private String telefone;
    private @NotBlank @Email String email;
    private @NotBlank @Email String confirmarEmail;
    private @NotBlank String cep;
    private @NotBlank String logradouro;
    private @NotBlank String numero;
    private String complemento;
    private @NotBlank String cidade;
    private @NotBlank String bairro;
    private @NotBlank String estado;

    public Long getId() {
        return this.id;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public String getCpfResponsavel() {
        return this.cpfResponsavel;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCelular() {
        return this.celular;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public String getConfirmarEmail() {
        return this.confirmarEmail;
    }

    public String getCep() {
        return this.cep;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public String getNumero() {
        return this.numero;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public String getCidade() {
        return this.cidade;
    }

    public String getBairro() {
        return this.bairro;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public void setCnpj(final String cnpj) {
        this.cnpj = cnpj;
    }

    public void setCpfResponsavel(final String cpfResponsavel) {
        this.cpfResponsavel = cpfResponsavel;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public void setCelular(final String celular) {
        this.celular = celular;
    }

    public void setTelefone(final String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public void setConfirmarEmail(final String confirmarEmail) {
        this.confirmarEmail = confirmarEmail;
    }

    public void setCep(final String cep) {
        this.cep = cep;
    }

    public void setLogradouro(final String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumero(final String numero) {
        this.numero = numero;
    }

    public void setComplemento(final String complemento) {
        this.complemento = complemento;
    }

    public void setCidade(final String cidade) {
        this.cidade = cidade;
    }

    public void setBairro(final String bairro) {
        this.bairro = bairro;
    }

    public void setEstado(final String estado) {
        this.estado = estado;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof PessoaJuridica)) {
            return false;
        } else {
            PessoaJuridica other = (PessoaJuridica)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label191: {
                    Object this$id = this.getId();
                    Object other$id = other.getId();
                    if (this$id == null) {
                        if (other$id == null) {
                            break label191;
                        }
                    } else if (this$id.equals(other$id)) {
                        break label191;
                    }

                    return false;
                }

                Object this$cnpj = this.getCnpj();
                Object other$cnpj = other.getCnpj();
                if (this$cnpj == null) {
                    if (other$cnpj != null) {
                        return false;
                    }
                } else if (!this$cnpj.equals(other$cnpj)) {
                    return false;
                }

                Object this$cpfResponsavel = this.getCpfResponsavel();
                Object other$cpfResponsavel = other.getCpfResponsavel();
                if (this$cpfResponsavel == null) {
                    if (other$cpfResponsavel != null) {
                        return false;
                    }
                } else if (!this$cpfResponsavel.equals(other$cpfResponsavel)) {
                    return false;
                }

                label170: {
                    Object this$nome = this.getNome();
                    Object other$nome = other.getNome();
                    if (this$nome == null) {
                        if (other$nome == null) {
                            break label170;
                        }
                    } else if (this$nome.equals(other$nome)) {
                        break label170;
                    }

                    return false;
                }

                label163: {
                    Object this$celular = this.getCelular();
                    Object other$celular = other.getCelular();
                    if (this$celular == null) {
                        if (other$celular == null) {
                            break label163;
                        }
                    } else if (this$celular.equals(other$celular)) {
                        break label163;
                    }

                    return false;
                }

                Object this$telefone = this.getTelefone();
                Object other$telefone = other.getTelefone();
                if (this$telefone == null) {
                    if (other$telefone != null) {
                        return false;
                    }
                } else if (!this$telefone.equals(other$telefone)) {
                    return false;
                }

                Object this$email = this.getEmail();
                Object other$email = other.getEmail();
                if (this$email == null) {
                    if (other$email != null) {
                        return false;
                    }
                } else if (!this$email.equals(other$email)) {
                    return false;
                }

                label142: {
                    Object this$confirmarEmail = this.getConfirmarEmail();
                    Object other$confirmarEmail = other.getConfirmarEmail();
                    if (this$confirmarEmail == null) {
                        if (other$confirmarEmail == null) {
                            break label142;
                        }
                    } else if (this$confirmarEmail.equals(other$confirmarEmail)) {
                        break label142;
                    }

                    return false;
                }

                label135: {
                    Object this$cep = this.getCep();
                    Object other$cep = other.getCep();
                    if (this$cep == null) {
                        if (other$cep == null) {
                            break label135;
                        }
                    } else if (this$cep.equals(other$cep)) {
                        break label135;
                    }

                    return false;
                }

                Object this$logradouro = this.getLogradouro();
                Object other$logradouro = other.getLogradouro();
                if (this$logradouro == null) {
                    if (other$logradouro != null) {
                        return false;
                    }
                } else if (!this$logradouro.equals(other$logradouro)) {
                    return false;
                }

                label121: {
                    Object this$numero = this.getNumero();
                    Object other$numero = other.getNumero();
                    if (this$numero == null) {
                        if (other$numero == null) {
                            break label121;
                        }
                    } else if (this$numero.equals(other$numero)) {
                        break label121;
                    }

                    return false;
                }

                Object this$complemento = this.getComplemento();
                Object other$complemento = other.getComplemento();
                if (this$complemento == null) {
                    if (other$complemento != null) {
                        return false;
                    }
                } else if (!this$complemento.equals(other$complemento)) {
                    return false;
                }

                label107: {
                    Object this$cidade = this.getCidade();
                    Object other$cidade = other.getCidade();
                    if (this$cidade == null) {
                        if (other$cidade == null) {
                            break label107;
                        }
                    } else if (this$cidade.equals(other$cidade)) {
                        break label107;
                    }

                    return false;
                }

                Object this$bairro = this.getBairro();
                Object other$bairro = other.getBairro();
                if (this$bairro == null) {
                    if (other$bairro != null) {
                        return false;
                    }
                } else if (!this$bairro.equals(other$bairro)) {
                    return false;
                }

                Object this$estado = this.getEstado();
                Object other$estado = other.getEstado();
                if (this$estado == null) {
                    if (other$estado != null) {
                        return false;
                    }
                } else if (!this$estado.equals(other$estado)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PessoaJuridica;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $cnpj = this.getCnpj();
        result = result * 59 + ($cnpj == null ? 43 : $cnpj.hashCode());
        Object $cpfResponsavel = this.getCpfResponsavel();
        result = result * 59 + ($cpfResponsavel == null ? 43 : $cpfResponsavel.hashCode());
        Object $nome = this.getNome();
        result = result * 59 + ($nome == null ? 43 : $nome.hashCode());
        Object $celular = this.getCelular();
        result = result * 59 + ($celular == null ? 43 : $celular.hashCode());
        Object $telefone = this.getTelefone();
        result = result * 59 + ($telefone == null ? 43 : $telefone.hashCode());
        Object $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
        Object $confirmarEmail = this.getConfirmarEmail();
        result = result * 59 + ($confirmarEmail == null ? 43 : $confirmarEmail.hashCode());
        Object $cep = this.getCep();
        result = result * 59 + ($cep == null ? 43 : $cep.hashCode());
        Object $logradouro = this.getLogradouro();
        result = result * 59 + ($logradouro == null ? 43 : $logradouro.hashCode());
        Object $numero = this.getNumero();
        result = result * 59 + ($numero == null ? 43 : $numero.hashCode());
        Object $complemento = this.getComplemento();
        result = result * 59 + ($complemento == null ? 43 : $complemento.hashCode());
        Object $cidade = this.getCidade();
        result = result * 59 + ($cidade == null ? 43 : $cidade.hashCode());
        Object $bairro = this.getBairro();
        result = result * 59 + ($bairro == null ? 43 : $bairro.hashCode());
        Object $estado = this.getEstado();
        result = result * 59 + ($estado == null ? 43 : $estado.hashCode());
        return result;
    }

    public String toString() {
        Long var10000 = this.getId();
        return "PessoaJuridica(id=" + var10000 + ", cnpj=" + this.getCnpj() + ", cpfResponsavel=" + this.getCpfResponsavel() + ", nome=" + this.getNome() + ", celular=" + this.getCelular() + ", telefone=" + this.getTelefone() + ", email=" + this.getEmail() + ", confirmarEmail=" + this.getConfirmarEmail() + ", cep=" + this.getCep() + ", logradouro=" + this.getLogradouro() + ", numero=" + this.getNumero() + ", complemento=" + this.getComplemento() + ", cidade=" + this.getCidade() + ", bairro=" + this.getBairro() + ", estado=" + this.getEstado() + ")";
    }

    public PessoaJuridica() {
    }

    public PessoaJuridica(final Long id, final String cnpj, final String cpfResponsavel, final String nome, final String celular, final String telefone, final String email, final String confirmarEmail, final String cep, final String logradouro, final String numero, final String complemento, final String cidade, final String bairro, final String estado) {
        this.id = id;
        this.cnpj = cnpj;
        this.cpfResponsavel = cpfResponsavel;
        this.nome = nome;
        this.celular = celular;
        this.telefone = telefone;
        this.email = email;
        this.confirmarEmail = confirmarEmail;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.bairro = bairro;
        this.estado = estado;
    }
}
