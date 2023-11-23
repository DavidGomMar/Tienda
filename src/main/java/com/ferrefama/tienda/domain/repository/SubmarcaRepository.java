package com.ferrefama.tienda.domain.repository;

import com.ferrefama.tienda.domain.Subbrand;

import java.util.List;
import java.util.Optional;

public interface SubmarcaRepository {

    List<Subbrand> getAll();
    Optional<Subbrand> getSubbrand(int submarcaId);
    Subbrand save(Subbrand subbrand);
    void delete(int submarcaId);
}
