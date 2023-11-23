package com.ferrefama.tienda.domain.repository;

import com.ferrefama.tienda.domain.Colony;

import java.util.List;
import java.util.Optional;

public interface ColoniaRepository {

    List<Colony> getAll();
    Optional<Colony> getColony(int coloniaId);
    Colony save(Colony colony);
    void delete(int coloniaId);
}
