package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.CategoriaArticulo;

@Repository
public interface CategoriaArticuloRepository extends JpaRepository<CategoriaArticulo, Long> {

}
