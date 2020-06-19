package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.example.demo.entities.Articulo;

@Repository
public interface ArticuloRepository extends JpaRepository<Articulo, Long> {
    @Query("select a FROM Articulo a WHERE a.categoriaArticulo.denominacion=?1")
    List<Articulo> findByCategoria(String categoria);
}
