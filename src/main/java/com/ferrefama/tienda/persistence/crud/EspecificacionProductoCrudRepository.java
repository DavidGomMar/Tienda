package com.ferrefama.tienda.persistence.crud;

import com.ferrefama.tienda.persistence.entity.EspecificacionProducto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EspecificacionProductoCrudRepository extends CrudRepository<EspecificacionProducto, Integer> {

    List<EspecificacionProducto> findByIdespecificacion_producto(int idEspecificacion_producto);
    List<EspecificacionProducto> findByIdEspecificacion(int idEspecificacion);

    List<EspecificacionProducto> findByIdProducto(int idProducto);
}
