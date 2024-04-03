package com.findall.findall.controller;


import com.findall.findall.model.Servico;
import com.findall.findall.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/servicos")
public class ServicoController {

    @Autowired
    private ServicoRepository servicoRepository;

    @PostMapping
    public ResponseEntity<Servico> criar(@RequestBody Servico servico) {
        Servico servicoSalvo = servicoRepository.save(servico);
        return ResponseEntity.status(HttpStatus.CREATED).body(servicoSalvo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Servico> buscarPorId(@PathVariable Long id) {
        Optional<Servico> servico = servicoRepository.findById(id);
        return servico.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}

