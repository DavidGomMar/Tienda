package com.ferrefama.tienda.persistence.crud;

import com.ferrefama.tienda.persistence.entity.Marca;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MarcaCrudRepository extends CrudRepository<Marca, Integer> {

    List<Marca> findByIdmarca (int idMarca);

}
