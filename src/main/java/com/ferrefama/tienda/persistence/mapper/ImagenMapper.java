package com.ferrefama.tienda.persistence.mapper;


import com.ferrefama.tienda.domain.Image;
import com.ferrefama.tienda.persistence.entity.Imagen;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring", uses = {ProductoMapper.class})
public interface ImagenMapper {
    @Mappings({
            @Mapping(source = "idimagen", target = "imagenId"),
            @Mapping(source = "rutaimagen", target = "rutaimagen"),
            @Mapping(source = "noorden", target = "noorden"),
            @Mapping(source = "producto", target = "product")
    })
    Image toImage (Imagen imagen);
    List<Image> toImage (List<Imagen> imagens);

    @InheritInverseConfiguration
    Imagen toImagen (Image image);
}
