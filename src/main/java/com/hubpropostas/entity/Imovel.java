package com.hubpropostas.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import com.hubpropostas.enums.ModalidadeGarantia;
import jakarta.persistence.*;

@Entity
@Table(name = "imoveis")
public class Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String codigo;

    @Column(nullable = false)
    private String endereco;

    @Column(nullable = false)
    private BigDecimal valorAluguel;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ModalidadeGarantia modalidade;

    @Column(nullable = false)
    private Boolean ativo = true;

    public Imovel() {
    }

    public Long getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public BigDecimal getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(BigDecimal valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public ModalidadeGarantia getModalidade() {
        return modalidade;
    }

    public void setModalidade(ModalidadeGarantia modalidade) {
        this.modalidade = modalidade;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}