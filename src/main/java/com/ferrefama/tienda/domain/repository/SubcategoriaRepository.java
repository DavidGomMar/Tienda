package com.ferrefama.tienda.domain.repository;

import com.ferrefama.tienda.domain.Subcategory;

import java.util.List;
import java.util.Optional;

public interface SubcategoriaRepository {
    List<Subcategory> getAll();
    Optional<Subcategory> getSubcategory(int subcategoriaId);
    Subcategory save(Subcategory subcategory);
    void delete(int subcategoriaId);
}
