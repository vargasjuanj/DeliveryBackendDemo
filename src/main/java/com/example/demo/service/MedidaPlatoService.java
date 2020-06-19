package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.Optional;

import com.example.demo.entities.MedidaPlato;
import com.example.demo.repository.MedidaPlatoRepository;

@Service
public class MedidaPlatoService extends BaseService<MedidaPlato, MedidaPlatoRepository> {
    @Override
    public MedidaPlato update(long id, MedidaPlato medidaPlato) throws Exception {
        try {
            Optional<MedidaPlato> entityOptional =this.repository.findById(id);
            medidaPlato.setId(entityOptional.get().getId());
            medidaPlato = this.repository.save(medidaPlato);

            return medidaPlato;

        } catch (Exception e) {

            throw new Exception(e.getMessage());

        }

    }
}
