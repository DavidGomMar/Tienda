package com.ferrefama.tienda.domain.repository;

import com.ferrefama.tienda.domain.Role;

import java.util.List;
import java.util.Optional;

public interface RolRepository {
    List<Role> getAll();
    Optional<Role> getRole (int rolId);
    Role save(Role rol);
    void delete (int rolId);
}
