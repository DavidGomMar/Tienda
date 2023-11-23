package com.ferrefama.tienda.domain.repository;

import com.ferrefama.tienda.domain.Productspecification;

import java.util.List;
import java.util.Optional;

public interface EspecificacionProductoRepository {
    List<Productspecification> getAll();
    Optional<Productspecification> getProductspecification(int especificacionProductoId);
    Productspecification save(Productspecification productspecification);
    void delete(int especificacionproductoId);
}
