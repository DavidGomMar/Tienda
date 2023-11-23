package com.ferrefama.tienda.domain.repository;

import com.ferrefama.tienda.domain.Order;

import java.util.List;
import java.util.Optional;

public interface PedidoRepository {
    List<Order> getAll();
    Optional<Order> getOrder(int pedidoId);
    Order save(Order order);
    void delete(int pedidoId);
}
