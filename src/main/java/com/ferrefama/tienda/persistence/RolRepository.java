package com.ferrefama.tienda.persistence;

import com.ferrefama.tienda.persistence.crud.RolCrudRepository;
import com.ferrefama.tienda.persistence.entity.Rol;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RolRepository {
    private RolCrudRepository rolCrudRepository;

    public List<Rol> getAll(){
        return (List<Rol>) rolCrudRepository.findAll();
    }

    //public List<Rol> getByRol(int idRol){
      //  return rolCrudRepository.findByIdrol(idRol);
    //}

    public Optional<Rol> getRol(int idRol){
        return rolCrudRepository.findById(idRol);
    }

    public Rol save(Rol rol) {
        return rolCrudRepository.save(rol);
    }

    public void delete(int idRol){
        rolCrudRepository.deleteById(idRol);
    }
}
