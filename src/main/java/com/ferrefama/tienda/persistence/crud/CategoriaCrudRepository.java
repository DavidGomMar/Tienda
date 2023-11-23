package com.ferrefama.tienda.persistence.crud;

import com.ferrefama.tienda.persistence.entity.Categoria;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CategoriaCrudRepository extends CrudRepository<Categoria, Integer> {

    List<Categoria> findByIdcategoriaOrderByNombrecategoriaAsc(int idcategoria);
    List<Categoria> findByIdFamilia(int idFamilia);




}
