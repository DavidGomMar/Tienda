package com.ferrefama.tienda.persistence.crud;

import com.ferrefama.tienda.persistence.entity.Direccion;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DireccionCrudRepository extends CrudRepository<Direccion, Integer> {

    List<Direccion> findByIddireccion(int iddireccion);
    List<Direccion> findByIdcolonia(int idColonia);
}
