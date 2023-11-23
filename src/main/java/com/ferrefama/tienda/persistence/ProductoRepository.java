package com.ferrefama.tienda.persistence;

import com.ferrefama.tienda.persistence.crud.ProductoCrudRepository;
import com.ferrefama.tienda.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }


    public List<Producto> getBySubmarca(int idSubmarca){
        return productoCrudRepository.findByIdSubmarca(idSubmarca);
    }

    public List<Producto>getBySubcategoria(int idSubcategoria){
        return productoCrudRepository.findByIdSubcategoria(idSubcategoria);
    }

    public Optional<Producto> getProducto(int idProducto){
        return productoCrudRepository.findById(idProducto);
    }

    public Producto save(Producto producto){
        return productoCrudRepository.save(producto);
    }

    public void delete(int idProducto) {
        productoCrudRepository.deleteById(idProducto);
    }
}
