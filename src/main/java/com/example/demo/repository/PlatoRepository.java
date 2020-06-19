package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.example.demo.entities.Plato;

@Repository
public interface PlatoRepository extends JpaRepository<Plato, Long> {
    @Query("select p FROM Plato p WHERE p.categoriaPlato.denominacion=?1")
    List<Plato> findByCategoria(String categoria);
}
