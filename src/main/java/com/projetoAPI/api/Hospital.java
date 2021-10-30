package com.projetoAPI.api;


import org.hibernate.annotations.Tables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.*;


@Entity
@Transactional
@Table(name = "Hospital")

public class Hospital {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nome", length = 100)
    private String nome;

    @Column(name = "endereço")
    private String endereço;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "localizaçao")
    private Localizaçao localizaçao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setLocalizaçao(Localizaçao localizaçao) {
        this.localizaçao = localizaçao;
    }


    public String getNome() {
        return nome;
    }
    public String getEndereço() {
        return endereço;
    }
    public String getCnpj() {
        return cnpj;
    }

    public Localizaçao getLocalizaçao() {
        return localizaçao;
    }
}
