package com.ferrefama.tienda.persistence;

import com.ferrefama.tienda.persistence.crud.UsuarioCrudRepository;
import com.ferrefama.tienda.persistence.entity.Usuario;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UsuarioRepository {
    private UsuarioCrudRepository usuarioCrudRepository;
    public List<Usuario> getAll(){
        return (List<Usuario>) usuarioCrudRepository.findAll();
    }

    public List<Usuario> getByRol(int idRol){
        return usuarioCrudRepository.findByRol(idRol);
    }

    public List<Usuario> getByPersona(int idPersona){
        return usuarioCrudRepository.findByPersona(idPersona);
    }

    public Optional<Usuario> getUsuario(int idUsuario){
        return usuarioCrudRepository.findById(idUsuario);
    }

    public Usuario save(Usuario usuario){
        return usuarioCrudRepository.save(usuario);
    }

    public void delete(int idUsuario) {
        usuarioCrudRepository.deleteById(idUsuario);
    }
}
