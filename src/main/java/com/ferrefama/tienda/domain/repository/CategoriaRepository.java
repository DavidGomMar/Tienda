package com.ferrefama.tienda.domain.repository;

import com.ferrefama.tienda.domain.Category;


import java.util.List;
import java.util.Optional;

public interface CategoriaRepository {
    List<Category> getAll();

    Optional<List<Category>> getByFamily(int familyId);
    Optional<Category> getCategory(int categoryId);

    Category save(Category category);
    void delete(int categoriaId);


}
