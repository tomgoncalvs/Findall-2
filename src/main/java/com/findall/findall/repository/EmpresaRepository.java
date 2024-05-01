package com.findall.findall.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.findall.findall.model.Empresa;
import java.util.List;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
    List<Empresa> findByNomeCompletoContaining(String nome);

    @Query("select e from Empresa e join e.horariosDisponiveis hd where hd like %?1%")
    List<Empresa> findByDiaDisponivel(String dia);
}
