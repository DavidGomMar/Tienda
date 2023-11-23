package com.ferrefama.tienda.domain.repository;

import com.ferrefama.tienda.domain.Brand;

import java.util.List;
import java.util.Optional;

public interface MarcaRepository {
    List<Brand> getAll();

    Optional<Brand> getBrand(int marcaId);
    Brand save(Brand brand);
    void delete(int marcaId);
}
