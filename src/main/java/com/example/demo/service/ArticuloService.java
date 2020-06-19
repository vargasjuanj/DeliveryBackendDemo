package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import com.example.demo.entities.Articulo;
import com.example.demo.repository.ArticuloRepository;

@Service
public class ArticuloService extends BaseService<Articulo, ArticuloRepository> {

    // Para no incluir en el cuerpo del postman el id cuando hago el put. Evitando
    // que se cree otro objeto
    @Override
    public Articulo update(long id, Articulo articulo) throws Exception {
        try {
            Optional<Articulo> entityOptional = this.repository.findById(id);
            articulo.setId(entityOptional.get().getId());
            articulo = this.repository.save(articulo);

            return articulo;

        } catch (Exception e) {

            throw new Exception(e.getMessage());

        }

    }

    public List<Articulo> findByCategoria(String categoria) {
        return this.repository.findByCategoria(categoria);
    }
}
