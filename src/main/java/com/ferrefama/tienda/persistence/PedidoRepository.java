package com.ferrefama.tienda.persistence;

import com.ferrefama.tienda.persistence.crud.PedidoCrudRepository;
import com.ferrefama.tienda.persistence.entity.Pedido;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public class PedidoRepository {
    private PedidoCrudRepository pedidoCrudRepository;

    public List<Pedido> getAll(){
        return (List<Pedido>) pedidoCrudRepository.findAll();
    }

    public List<Pedido> getByUsuario(int idUsuario){
        return pedidoCrudRepository.findByIdusuario(idUsuario);
    }

    public List<Pedido> getByDireccion(int idDireccion){
        return pedidoCrudRepository.findByIddireccion(idDireccion);
    }

    public Optional<Pedido> getPedido(int idPedido){
        return pedidoCrudRepository.findById(idPedido);
    }

    public Pedido save(Pedido pedido){
        return pedidoCrudRepository.save(pedido);
    }

    public void delete(int idPedido){
        pedidoCrudRepository.deleteById(idPedido);
    }
}
