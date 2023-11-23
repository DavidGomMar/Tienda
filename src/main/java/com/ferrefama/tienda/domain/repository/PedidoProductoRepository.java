package com.ferrefama.tienda.domain.repository;

import com.ferrefama.tienda.domain.ProductOrder;

import java.util.List;
import java.util.Optional;

public interface PedidoProductoRepository {
    List<ProductOrder> getAll();
    Optional<ProductOrder> getProductorder(int pedidoproductoId);
    ProductOrder save(ProductOrder productOrder);
    void delete(int pedidoproductoId);

}
