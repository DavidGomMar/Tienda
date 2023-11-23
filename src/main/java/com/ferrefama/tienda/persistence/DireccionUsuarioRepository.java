package com.ferrefama.tienda.persistence;

import com.ferrefama.tienda.persistence.crud.DireccionCrudRepository;
import com.ferrefama.tienda.persistence.crud.DireccionUsuarioCrudRepository;
import com.ferrefama.tienda.persistence.entity.DireccionUsuario;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DireccionUsuarioRepository {
    private DireccionUsuarioCrudRepository direccionUsuarioCrudRepository;

    public List<DireccionUsuario> getAll(){
        return (List<DireccionUsuario>) direccionUsuarioCrudRepository.findAll();
    }

    public List<DireccionUsuario> getByPersona (int idPersona){
        return direccionUsuarioCrudRepository.findByIdpersona(idPersona);
    }

    public List<DireccionUsuario> getByDireccion (int idDireccion){
        return direccionUsuarioCrudRepository.findByIddireccion(idDireccion);
    }

    public Optional<DireccionUsuario> getDireccionusuario(int idDireccionusuario){
        return direccionUsuarioCrudRepository.findById(idDireccionusuario);
    }

    public DireccionUsuario save(DireccionUsuario direccionUsuario){
        return direccionUsuarioCrudRepository.save(direccionUsuario);
    }

    public void delete(int idDireccionusuario){
        direccionUsuarioCrudRepository.deleteById(idDireccionusuario);
    }
}
