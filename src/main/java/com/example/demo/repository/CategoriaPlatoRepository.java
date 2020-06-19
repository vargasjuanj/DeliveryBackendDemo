package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.CategoriaPlato;

@Repository
public interface CategoriaPlatoRepository extends JpaRepository<CategoriaPlato, Long> {

}
