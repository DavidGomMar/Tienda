package com.ferrefama.tienda.persistence.crud;

import com.ferrefama.tienda.persistence.entity.Rol;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RolCrudRepository extends CrudRepository<Rol, Integer> {

    List<Rol> findByIdrol (int idRol);
}
