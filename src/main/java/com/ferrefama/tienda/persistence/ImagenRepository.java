package com.ferrefama.tienda.persistence;

import com.ferrefama.tienda.persistence.crud.ImagenCrudRepository;
import com.ferrefama.tienda.persistence.entity.Imagen;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ImagenRepository {
    private ImagenCrudRepository imagenCrudRepository;

    public List<Imagen> getAll(){
        return (List<Imagen>) imagenCrudRepository.findAll();
    }

    //public List<Imagen> getByImagen(int idImagen){
      //  return imagenCrudRepository.findByIdimagen(idImagen);
    //}

    public List<Imagen> getByProducto(int idProducto){
        return imagenCrudRepository.findByIdproducto(idProducto);
    }

    public Optional<Imagen> getImagen (int idImagen){
        return imagenCrudRepository.findById(idImagen);
    }

    public Imagen save(Imagen imagen){
        return imagenCrudRepository.save(imagen);
    }

    public void delete(int idImagen){
        imagenCrudRepository.deleteById(idImagen);
    }
}
