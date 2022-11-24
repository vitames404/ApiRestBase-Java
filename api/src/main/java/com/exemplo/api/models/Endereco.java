package com.exemplo.api.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;



@Entity
@Table(name="Endereco")
public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private long id;
    @NotNull
    @Column(name = "cep")
    private String cep;
    @NotNull
    @Column(name = "logradouro")
    private String logradouro;
    @NotNull
    @Column(name = "numero")
    private String numero;
    @NotNull
    @Column(name = "complemento")
    private String complemento;

    @NotNull
    @Column(name="pessoaId")
    private int pessoaId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getPessoaId() {
        return pessoaId;
    }

    public void setPessoaId(int pessoaId) {
        this.pessoaId = pessoaId;
    }
}
