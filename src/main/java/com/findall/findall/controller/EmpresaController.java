package com.findall.findall.controller;

import com.findall.findall.model.Empresa;
import com.findall.findall.repository.EmpresaRepository;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {

    @Autowired
    private EmpresaRepository empresaRepository;

    @PostMapping
    public ResponseEntity<Empresa> criar(@Valid @RequestBody Empresa empresa) {
        Empresa empresaSalva = empresaRepository.save(empresa);
        return ResponseEntity.status(HttpStatus.CREATED).body(empresaSalva);
    }

    @GetMapping
    public List<Empresa> listar() {
        return empresaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empresa> buscarPeloId(@PathVariable Long id) {
        Optional<Empresa> empresa = empresaRepository.findById(id);
        return empresa.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/nome")
    public ResponseEntity<List<Empresa>> buscarPorNome(@RequestParam String nome) {
        List<Empresa> empresas = empresaRepository.findByNomeCompletoContaining(nome);
        return ResponseEntity.ok(empresas);
    }

    @GetMapping("/dia")
    public ResponseEntity<List<Empresa>> buscarPorDiaDisponivel(@RequestParam String dia) {
        List<Empresa> empresas = empresaRepository.findByDiaDisponivel(dia);
        return ResponseEntity.ok(empresas);
    }
}
