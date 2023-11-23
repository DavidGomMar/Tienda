package com.ferrefama.tienda.persistence.crud;

import com.ferrefama.tienda.persistence.entity.Colonia;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ColoniaCrudRepository extends CrudRepository<Colonia, Integer> {

    List<Colonia> findByIdcolonia (int idcolonia);
}
