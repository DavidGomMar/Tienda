package com.ferrefama.tienda.domain.repository;

import com.ferrefama.tienda.domain.Family;

import java.util.List;

public interface FamiliaRepository {
    List<Family> getAll();
    List<Family> getByFamily(int familiaId);
    Family save(Family family);
    void delete(int familiaId);
}
