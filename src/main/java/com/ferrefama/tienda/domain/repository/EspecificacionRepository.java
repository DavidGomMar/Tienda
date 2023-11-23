package com.ferrefama.tienda.domain.repository;


import com.ferrefama.tienda.domain.Specification;

import java.util.List;
import java.util.Optional;

public interface EspecificacionRepository {
    List<Specification> getAll();
    Optional<Specification> getSpecification(int idEspecificacion);
    Specification save(Specification specification);
    void delete(int idEspecificacion);
}
