package com.ferrefama.tienda.persistence;

import com.ferrefama.tienda.persistence.crud.PersonaCrudRepository;
import com.ferrefama.tienda.persistence.entity.Persona;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PersonaRepository {
    private PersonaCrudRepository personaCrudRepository;

    public List<Persona> getAll(){
        return (List<Persona>) personaCrudRepository.findAll();
    }

    //public List<Persona> getByPersona(int idPersona){
      //  return personaCrudRepository.findByIdpersona(idPersona);
    //}

    public Optional<Persona> getPersona(int idPersona){
        return personaCrudRepository.findById(idPersona);
    }

    public Persona save(Persona persona) {
        return personaCrudRepository.save(persona);
    }

    public void delete(int idPersona) {
        personaCrudRepository.deleteById(idPersona);
    }
}
