package com.ferrefama.tienda.persistence;

import com.ferrefama.tienda.persistence.crud.EstatusCrudRepository;
import com.ferrefama.tienda.persistence.entity.Estatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EstatusRepository {
    private EstatusCrudRepository estatusCrudRepository;

    public List<Estatus> getAll(){
        return (List<Estatus>) estatusCrudRepository.findAll();
    }

    //public List<Estatus> getByEstatus(int idEstatus){
      //  return estatusCrudRepository.findByIdestatus(idEstatus);
    //}

    public Optional<Estatus> getEstatus(int idEstatus){
        return estatusCrudRepository.findById(idEstatus);
    }

    public Estatus save(Estatus estatus){
        return estatusCrudRepository.save(estatus);
    }

    public void delete(int idEstatus){
        estatusCrudRepository.deleteById(idEstatus);
    }
}
