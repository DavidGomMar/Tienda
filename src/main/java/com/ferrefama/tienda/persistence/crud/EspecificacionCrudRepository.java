package com.ferrefama.tienda.persistence.crud;

import com.ferrefama.tienda.persistence.entity.Especificacion;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EspecificacionCrudRepository extends CrudRepository<Especificacion, Integer> {

    List<Especificacion> findByIdespecificacion (int idEspecificacion);
}
