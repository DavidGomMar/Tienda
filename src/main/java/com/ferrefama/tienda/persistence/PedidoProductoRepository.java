package com.ferrefama.tienda.persistence;

import com.ferrefama.tienda.persistence.crud.PedidoProductoCrudRepository;
import com.ferrefama.tienda.persistence.entity.PedidoProducto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PedidoProductoRepository {
    private PedidoProductoCrudRepository pedidoProductoCrudRepository;

    public List<PedidoProducto> getAll(){
        return (List<PedidoProducto>) pedidoProductoCrudRepository.findAll();
    }

    //public List<PedidoProducto> getByPedidoProducto(int idPedidoproducto){
      //  return pedidoProductoCrudRepository.findByIdpedidoproducto(idPedidoproducto);
    //}
    public List<PedidoProducto> getByPedido(int idPedido){
        return pedidoProductoCrudRepository.findByIdpedido(idPedido);
    }

    public List<PedidoProducto> getByProducto(int idProducto){
        return pedidoProductoCrudRepository.findByIdproducto(idProducto);
    }

    public Optional<PedidoProducto> getPedidoproducto(int idPedidoproducto){
        return pedidoProductoCrudRepository.findById(idPedidoproducto);
    }

    public PedidoProducto save(PedidoProducto pedidoProducto){
        return pedidoProductoCrudRepository.save(pedidoProducto);
    }

    public void delete(int idPedidoproducto) {
        pedidoProductoCrudRepository.deleteById(idPedidoproducto);
    }
}
