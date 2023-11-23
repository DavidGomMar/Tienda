package com.ferrefama.tienda.domain.repository;

import com.ferrefama.tienda.domain.Address;

import java.util.List;
import java.util.Optional;

public interface DireccionRepository {
    List<Address> getAll();
    Optional<Address> getAddress(int direccionId);
    Address save(Address address);
    void delete (int direccionId);
}
