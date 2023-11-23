package com.ferrefama.tienda.persistence.crud;

import com.ferrefama.tienda.persistence.entity.Categoria;
import com.ferrefama.tienda.persistence.entity.Subcategoria;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SubcategoriaCrudRepository extends CrudRepository<Subcategoria, Integer> {

    List<Subcategoria> findByIdsubcategoria (int idSubcategoria);
    List<Subcategoria> findByIdCategoria(int idCategoria);
}
