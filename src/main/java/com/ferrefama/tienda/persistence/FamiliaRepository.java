package com.ferrefama.tienda.persistence;

import com.ferrefama.tienda.persistence.crud.FamiliaCrudRepository;
import com.ferrefama.tienda.persistence.entity.Familia;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class FamiliaRepository {

    private FamiliaCrudRepository familiaCrudRepository;

    //public List<Familia> getAll(){
      //  return (List<Familia>) familiaCrudRepository.findAll();
    //}

    public List<Familia> getByFamilias (int idfamilia) {
        return familiaCrudRepository.findByIdfamiliaOrderByNombrefamiliaAsc(idfamilia);
    }

    public Familia save(Familia familia) {
        return familiaCrudRepository.save(familia);
    }

    public void delete(int idfamilia){
        familiaCrudRepository.deleteById(idfamilia);
    }
}
