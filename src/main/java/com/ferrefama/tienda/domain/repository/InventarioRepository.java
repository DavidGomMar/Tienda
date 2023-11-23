package com.ferrefama.tienda.domain.repository;

import com.ferrefama.tienda.domain.Inventory;

import java.util.List;
import java.util.Optional;

public interface InventarioRepository {
    List <Inventory> getAll();
    Optional<Inventory> getInventory(int inventarioId);
    Inventory save(Inventory inventory);
    void delete(int inventarioId);
}
