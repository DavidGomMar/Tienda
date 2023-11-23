package com.ferrefama.tienda.domain.repository;

import com.ferrefama.tienda.domain.Image;
import com.ferrefama.tienda.persistence.entity.Imagen;

import java.util.List;
import java.util.Optional;

public interface ImagenRepository {

    List<Image> getAll();
    Optional<Image> getImage(int imagenId);
    Image save(Image image);
    void delete(int imagenId);
}
