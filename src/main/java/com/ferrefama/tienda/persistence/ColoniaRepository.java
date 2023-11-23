package com.ferrefama.tienda.persistence;

import com.ferrefama.tienda.persistence.crud.ColoniaCrudRepository;
import com.ferrefama.tienda.persistence.entity.Colonia;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public class ColoniaRepository {
    private ColoniaCrudRepository coloniaCrudRepository;

    public List<Colonia> getAll(){
        return (List<Colonia>) coloniaCrudRepository.findAll();
    }

    //public List<Colonia> getByColonia(int idColonia){
        //return coloniaCrudRepository.findByIdcolonia(idColonia);
    //}

    public Optional<Colonia> getColonia(int idColonia){
        return coloniaCrudRepository.findById(idColonia);
    }

    public Colonia save(Colonia colonia){
        return coloniaCrudRepository.save(colonia);
    }

    public void delete(int idColonia){
        coloniaCrudRepository.deleteById(idColonia);
    }
}
