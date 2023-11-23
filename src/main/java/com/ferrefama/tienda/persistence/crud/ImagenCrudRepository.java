package com.ferrefama.tienda.persistence.crud;

import com.ferrefama.tienda.persistence.entity.Imagen;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ImagenCrudRepository extends CrudRepository<Imagen, Integer> {

    List<Imagen> findByIdimagen (int idImagen);
    List<Imagen> findByIdproducto(int idProducto);
}
