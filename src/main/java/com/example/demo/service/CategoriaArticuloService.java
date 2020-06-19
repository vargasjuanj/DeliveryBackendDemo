package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.Optional;

import com.example.demo.entities.CategoriaArticulo;
import com.example.demo.repository.CategoriaArticuloRepository;

@Service
public class CategoriaArticuloService extends BaseService<CategoriaArticulo, CategoriaArticuloRepository>{

    @Override
    public CategoriaArticulo update(long id, CategoriaArticulo categoriaArticulo) throws Exception {
        try {
            Optional<CategoriaArticulo> entityOptional =this.repository.findById(id);
            categoriaArticulo.setId(entityOptional.get().getId());
            categoriaArticulo = this.repository.save(categoriaArticulo);

            return categoriaArticulo;

        } catch (Exception e) {

            throw new Exception(e.getMessage());

        }

    }
}
