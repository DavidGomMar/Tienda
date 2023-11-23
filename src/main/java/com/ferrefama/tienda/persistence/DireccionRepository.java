package com.ferrefama.tienda.persistence;

import com.ferrefama.tienda.persistence.crud.DireccionCrudRepository;
import com.ferrefama.tienda.persistence.entity.Direccion;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DireccionRepository {
    private DireccionCrudRepository direccionCrudRepository;

    public List<Direccion> getAll(){
        return (List<Direccion>) direccionCrudRepository.findAll();
    }

    public List<Direccion> getByColonia(int idColonia){
        return direccionCrudRepository.findByIdcolonia(idColonia);
    }

    public Optional<Direccion> getDireccion(int idDireccion){
        return direccionCrudRepository.findById(idDireccion);
    }

    public Direccion save(Direccion direccion){
        return direccionCrudRepository.save(direccion);
    }

    public void delete(int idDireccion){
        direccionCrudRepository.deleteById(idDireccion);
    }
}
