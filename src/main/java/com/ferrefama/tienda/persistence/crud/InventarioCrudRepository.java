package com.ferrefama.tienda.persistence.crud;

import com.ferrefama.tienda.persistence.entity.Inventario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InventarioCrudRepository extends CrudRepository<Inventario, Integer> {
    List<Inventario> findByIdloginventario(int idLoginventario);
    List<Inventario> findByIdusuario(int idUsuario);
    List<Inventario> findByIdproducto(int idProducto);
}
