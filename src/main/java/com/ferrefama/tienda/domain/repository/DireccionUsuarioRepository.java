package com.ferrefama.tienda.domain.repository;

import com.ferrefama.tienda.domain.Useraddress;

import java.util.List;
import java.util.Optional;

public interface DireccionUsuarioRepository {

    List<Useraddress> getAll();
    Optional<Useraddress> getUseraddress(int direccionusuarioId);
    Useraddress save(Useraddress useraddress);
    void delete(int direccionusuarioId);
}
