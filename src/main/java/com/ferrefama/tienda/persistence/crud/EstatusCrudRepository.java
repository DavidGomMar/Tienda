package com.ferrefama.tienda.persistence.crud;

import com.ferrefama.tienda.persistence.entity.Estatus;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EstatusCrudRepository extends CrudRepository<Estatus, Integer> {
    List<Estatus> findByIdestatus (int idEstatus);
}
