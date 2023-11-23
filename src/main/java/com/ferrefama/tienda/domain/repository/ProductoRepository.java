package com.ferrefama.tienda.domain.repository;

import com.ferrefama.tienda.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductoRepository {
    List<Product> getAll();
    Optional<Product> getProducto(int productoId);
    Product save(Product product);
    void delete (int productoId);
}
