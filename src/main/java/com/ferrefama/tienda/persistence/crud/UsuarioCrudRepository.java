package com.ferrefama.tienda.persistence.crud;

import com.ferrefama.tienda.persistence.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioCrudRepository extends CrudRepository<Usuario, Integer> {
    List<Usuario> findByIdusuario (int idUsuario);
    List<Usuario> findByRol (int idRol);
    List<Usuario> findByPersona (int idPersona);

}
