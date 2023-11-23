package com.ferrefama.tienda.persistence.crud;

import com.ferrefama.tienda.persistence.entity.Familia;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface FamiliaCrudRepository extends CrudRepository<Familia, Integer> {

    List<Familia> findByIdfamiliaOrderByNombrefamiliaAsc(int idfamilia);


}
