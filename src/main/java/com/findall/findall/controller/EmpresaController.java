package com.findall.findall.controller;

import com.findall.findall.model.Empresa;
import com.findall.findall.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {

    @Autowired
    private EmpresaRepository empresaRepository;

    @PostMapping
    public ResponseEntity<Empresa> criar(@jakarta.validation.Valid @RequestBody Empresa empresa) {
        Empresa empresaSalva = empresaRepository.save(empresa);
        return ResponseEntity.status(HttpStatus.CREATED).body(empresaSalva);
    }
}

