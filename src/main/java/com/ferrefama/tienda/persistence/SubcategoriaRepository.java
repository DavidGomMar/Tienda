package com.ferrefama.tienda.persistence;

import com.ferrefama.tienda.persistence.crud.SubcategoriaCrudRepository;
import com.ferrefama.tienda.persistence.entity.Subcategoria;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SubcategoriaRepository {
    private SubcategoriaCrudRepository subcategoriaCrudRepository;

    public List<Subcategoria> getAll(){
        return (List<Subcategoria>) subcategoriaCrudRepository.findAll();
    }

    public List<Subcategoria> getByCategoria(int idCategoria){
        return subcategoriaCrudRepository.findByIdCategoria(idCategoria);
    }

    public Optional<Subcategoria> getSubcategoria(int idSubcategoria){
        return subcategoriaCrudRepository.findById(idSubcategoria);
    }

    public Subcategoria save(Subcategoria subcategoria){
        return subcategoriaCrudRepository.save(subcategoria);
    }

    public void delete(int idSubcategoria){
        subcategoriaCrudRepository.deleteById(idSubcategoria);
    }
}
