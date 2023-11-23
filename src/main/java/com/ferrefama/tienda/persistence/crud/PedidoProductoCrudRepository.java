package com.ferrefama.tienda.persistence.crud;

import com.ferrefama.tienda.persistence.entity.PedidoProducto;
import com.ferrefama.tienda.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PedidoProductoCrudRepository extends CrudRepository<PedidoProducto, Integer> {

    List<PedidoProducto> findByIdpedidoproducto(int idPedidoproducto);
    List<PedidoProducto> findByIdpedido(int idPedido);
    List<PedidoProducto> findByIdproducto(int idProducto);
}
