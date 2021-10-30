package com.projetoAPI.api;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Transactional
@Table(name = "Recurso")
public class Recurso {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "medico")
    private int medico;

    @Column(name ="enfermeiro")
    private int enfermeiro ;

    @Column(name = "respirador")
    private int respirador;

    @Column(name = "tomorafo" )
    private int tomografo;

    @Column(name = "ambulancnia")
    private int ambulancia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMedico(int medico) {
        this.medico = medico;
    }

    public void setEnfermeiro(int enfermeiro) {
        this.enfermeiro = enfermeiro;
    }

    public void setRespirador(int respirador) {
        this.respirador = respirador;
    }

    public void setTomografo(int tomografo) {
        this.tomografo = tomografo;
    }

    public void setAmbulancia(int ambulancia) {
        this.ambulancia = ambulancia;
    }

    public int getMedico() {
        return medico;
    }

    public int getEnfermeiro() {
        return enfermeiro;
    }

    public int getRespirador() {
        return respirador;
    }

    public int getAmbulancia() {
        return ambulancia;
    }

    public int getTomografo() {
        return tomografo;
    }
}


