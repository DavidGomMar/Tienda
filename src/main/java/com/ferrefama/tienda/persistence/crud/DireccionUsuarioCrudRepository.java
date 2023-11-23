package com.ferrefama.tienda.persistence.crud;

import com.ferrefama.tienda.persistence.entity.DireccionUsuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DireccionUsuarioCrudRepository extends CrudRepository<DireccionUsuario, Integer> {

    List<DireccionUsuario> findByIddireccionusuario(int idDireccionusuario);
    List<DireccionUsuario> findByIddireccion(int idDireccion);
    List<DireccionUsuario> findByIdpersona(int idPersona);

}
