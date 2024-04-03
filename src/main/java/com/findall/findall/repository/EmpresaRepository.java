package com.findall.findall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.findall.findall.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}

