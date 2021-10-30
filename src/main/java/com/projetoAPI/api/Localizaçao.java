package com.projetoAPI.api;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Transactional
@Table(name = "Recurso")
public class Localizaçao {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "latitude")
    private int latitude;

    @Column(name = "lonitude")
    private int longitude;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
