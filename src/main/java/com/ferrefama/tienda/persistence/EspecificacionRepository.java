package com.ferrefama.tienda.persistence;

import com.ferrefama.tienda.persistence.crud.EspecificacionCrudRepository;
import com.ferrefama.tienda.persistence.entity.Especificacion;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EspecificacionRepository {
    private EspecificacionCrudRepository especificacionCrudRepository;

    public List<Especificacion> getAll(){return (List<Especificacion>) especificacionCrudRepository.findAll();}

    //public List<Especificacion> getByEspecificacion(int idEspecificacion){
      //  return especificacionCrudRepository.findByIdespecificacion(idEspecificacion);
    //}

    public Optional<Especificacion> getEspecificacion(int idEspecificacion){
        return especificacionCrudRepository.findById(idEspecificacion);
    }

    public Especificacion save(Especificacion especificacion) {
        return especificacionCrudRepository.save(especificacion);
    }

    public void delete(int idEspecificacion){
        especificacionCrudRepository.deleteById(idEspecificacion);
    }


}
