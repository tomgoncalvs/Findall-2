package com.findall.findall.model;

import org.hibernate.validator.constraints.br.CNPJ;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome completo é obrigatório")
    private String nomeCompleto;

    @NotBlank(message = "CNPJ é obrigatório")
    @CNPJ(message = "CNPJ inválido")
    private String cnpj;

    private String whatsapp;

    private String descricao;

    private String categoria;

    private BigDecimal custoMedioHora;

    @ElementCollection
    private List<String> horariosDisponiveis;

    // Getters e Setters
}

