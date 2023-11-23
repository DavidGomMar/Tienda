package com.ferrefama.tienda.domain.repository;

import com.ferrefama.tienda.domain.Status;

import java.util.List;
import java.util.Optional;

public interface EstatusRepository {
    List<Status> getAll();
    Optional<Status> getStatus(int estatusId);
    Status save(Status status);
    void delete(int estatusId);

}
