package com.ferrefama.tienda.persistence.crud;

import com.ferrefama.tienda.persistence.entity.Pedido;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PedidoCrudRepository extends CrudRepository<Pedido, Integer> {

    List<Pedido> findById_pedido (int id_Pedido);
    List<Pedido> findByIdusuario (int idUsuario);
    List<Pedido> findByIddireccion (int idDireccion);
}
