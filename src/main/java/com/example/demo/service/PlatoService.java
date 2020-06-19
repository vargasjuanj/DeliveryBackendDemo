package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Plato;
import com.example.demo.repository.PlatoRepository;

@Service
public class PlatoService extends BaseService<Plato, PlatoRepository> {
    @Override
    public Plato update(long id, Plato plato) throws Exception {
        try {
            Optional<Plato> entityOptional = this.repository.findById(id);
            plato.setId(entityOptional.get().getId());
            plato = this.repository.save(plato);

            return plato;

        } catch (Exception e) {

            throw new Exception(e.getMessage());

        }

    }

    public List<Plato> findByCategoria(String categoria) {
        return this.repository.findByCategoria(categoria);
    }
}
