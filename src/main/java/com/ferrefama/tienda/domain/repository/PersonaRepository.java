package com.ferrefama.tienda.domain.repository;

import com.ferrefama.tienda.domain.Person;

import java.util.List;
import java.util.Optional;

public interface PersonaRepository {
    List<Person> getAll();
    Optional<Person> getPerson(int personaId);
    Person save(Person person);
    void delete(int personaId);

}
