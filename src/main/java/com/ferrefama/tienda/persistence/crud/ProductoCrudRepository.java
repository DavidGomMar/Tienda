package com.ferrefama.tienda.persistence.crud;

import com.ferrefama.tienda.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    List<Producto> findByIdproducto(int idProducto);
    List<Producto> findByIdSubcategoria(int idSubcategoria);
    List<Producto> findByIdSubmarca(int idSubmarca);
}
