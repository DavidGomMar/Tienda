package com.ferrefama.tienda.domain.repository;

import com.ferrefama.tienda.domain.Orderstatus;

import java.util.List;
import java.util.Optional;

public interface EstatusPedidoRepository {
    List<Orderstatus> getAll();
    Optional<Orderstatus> getOrderstatus(int estatuspedidoId);
    Orderstatus save(Orderstatus orderstatus);
    void delete(int estatuspedidoId);
}
