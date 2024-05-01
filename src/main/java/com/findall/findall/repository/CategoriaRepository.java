package com.findall.findall.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.findall.findall.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
