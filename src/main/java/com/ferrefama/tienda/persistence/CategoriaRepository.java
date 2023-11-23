package com.ferrefama.tienda.persistence;

import com.ferrefama.tienda.domain.Category;
import com.ferrefama.tienda.persistence.crud.CategoriaCrudRepository;
import com.ferrefama.tienda.persistence.entity.Categoria;
import com.ferrefama.tienda.persistence.mapper.CategoriaMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository

public class CategoriaRepository implements com.ferrefama.tienda.domain.repository.CategoriaRepository {

    private CategoriaCrudRepository categoriaCrudRepository;
    private CategoriaMapper mapper;

    //obtiene todos los productos
    public List<Category> getAll(){
        List<Categoria> categorias = (List<Categoria>) categoriaCrudRepository.findAll();
        return mapper.toCategorys(categorias);
    }

    @Override
    public Optional<List<Category>> getByFamily(int familyId) {
        return Optional.empty();
    }

    @Override
    public Optional<Category> getCategory(int categoryId) {
        return Optional.empty();
    }

    @Override
    public Category save(Category category) {
        return null;
    }


    public List<Categoria> getByFamilia(int idFamilia){
        return categoriaCrudRepository.findByIdFamilia(idFamilia);
    }


    //buscar con su id
    public Optional<Categoria> getCategoria(int idCategoria){
        return categoriaCrudRepository.findById(idCategoria);
    }

    //Guardar
    public Categoria save(Categoria categoria){
        return categoriaCrudRepository.save(categoria);
    }

    //eliminar
    public  void delete(int idCategoria){
        categoriaCrudRepository.deleteById(idCategoria);
    }

}
