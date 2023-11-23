package com.ferrefama.tienda.persistence.crud;

import com.ferrefama.tienda.persistence.entity.Persona;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonaCrudRepository extends CrudRepository<Persona, Integer> {

    List<Persona> findByIdpersona (int idPersona);
}
