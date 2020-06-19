package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.Optional;

import com.example.demo.entities.CategoriaPlato;
import com.example.demo.repository.CategoriaPlatoRepository;

@Service
public class CategoriaPlatoService extends BaseService<CategoriaPlato, CategoriaPlatoRepository>{
    @Override
    public CategoriaPlato update(long id, CategoriaPlato categoriaPlato) throws Exception {
        try {
            Optional<CategoriaPlato> entityOptional =this.repository.findById(id);
            categoriaPlato.setId(entityOptional.get().getId());
            categoriaPlato = this.repository.save(categoriaPlato);

            return categoriaPlato;

        } catch (Exception e) {

            throw new Exception(e.getMessage());

        }

    }

}
