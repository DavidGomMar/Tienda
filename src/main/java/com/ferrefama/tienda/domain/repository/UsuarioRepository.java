package com.ferrefama.tienda.domain.repository;

import com.ferrefama.tienda.domain.User;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository {
    List<User> getAll();
    Optional<User> getUsuario (int usuarioId);
    User save(User user);
    void delete(int usuarioId);
}
