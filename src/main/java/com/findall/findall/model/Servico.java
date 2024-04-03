package com.findall.findall.model;


import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;
import java.util.List;

@Entity
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome do serviço é obrigatório")
    private String nome;

    @NotBlank(message = "Valor é obrigatório")
    private BigDecimal valor;

    private String prazo;

    private String descricao;

    @ElementCollection
    private List<String> imagens;

    @ManyToOne
    private Empresa empresa;

}

