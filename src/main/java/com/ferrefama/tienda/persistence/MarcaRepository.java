package com.ferrefama.tienda.persistence;

import com.ferrefama.tienda.persistence.crud.MarcaCrudRepository;
import com.ferrefama.tienda.persistence.entity.Marca;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MarcaRepository {
    private MarcaCrudRepository marcaCrudRepository;

    public List<Marca> getAll(){
        return (List<Marca>) marcaCrudRepository.findAll();
    }

    public List<Marca> getByMarca(int idMarca){
        return marcaCrudRepository.findByIdmarca(idMarca);
    }

    public Optional<Marca> getMarca(int idMarca){
        return marcaCrudRepository.findById(idMarca);
    }

    public Marca save(Marca marca){
        return marcaCrudRepository.save(marca);
    }

    public void delete(int idMarca){
        marcaCrudRepository.deleteById(idMarca);
    }
}
