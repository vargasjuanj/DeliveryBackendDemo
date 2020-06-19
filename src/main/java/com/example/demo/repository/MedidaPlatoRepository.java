package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.MedidaPlato;

@Repository
public interface MedidaPlatoRepository extends JpaRepository<MedidaPlato, Long> {

}
