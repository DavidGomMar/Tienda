package com.ferrefama.tienda.persistence;

import com.ferrefama.tienda.persistence.crud.SubmarcaCrudRepository;
import com.ferrefama.tienda.persistence.entity.Submarca;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SubmarcaRepository {
    private SubmarcaCrudRepository submarcaCrudRepository;

    public List<Submarca> getAll(){
        return (List<Submarca>) submarcaCrudRepository.findAll();
    }

    public  List<Submarca> getByMarca(int idMarca){
        return submarcaCrudRepository.findByIdMarca(idMarca);
    }

    public Optional<Submarca> getSubmarca(int idSubmarca){
        return submarcaCrudRepository.findById(idSubmarca);
    }

    public Submarca save(Submarca submarca) {
        return submarcaCrudRepository.save(submarca);
    }

    public void delete(int idSubmarca) {
        submarcaCrudRepository.deleteById(idSubmarca);
    }
}
