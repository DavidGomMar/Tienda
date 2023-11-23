package com.ferrefama.tienda.persistence.crud;

import com.ferrefama.tienda.persistence.entity.Categoria;
import com.ferrefama.tienda.persistence.entity.Submarca;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SubmarcaCrudRepository extends CrudRepository<Submarca, Integer> {
    List<Submarca> findByIdsubmarca (int idSubmarca);
    List<Submarca> findByIdMarca(int idFamilia);
}
