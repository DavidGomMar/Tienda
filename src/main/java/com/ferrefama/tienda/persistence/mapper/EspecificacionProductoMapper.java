package com.ferrefama.tienda.persistence.mapper;

import com.ferrefama.tienda.domain.Productspecification;
import com.ferrefama.tienda.persistence.entity.EspecificacionProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring", uses = {ProductoMapper.class, EspecificacionMapper.class})
public interface EspecificacionProductoMapper {
    @Mappings({
            @Mapping(source = "idespecificacion_producto", target = "especificacionproductoId"),
            @Mapping(source = "especificacion", target = "specification"),
            @Mapping(source = "producto", target = "product")
    })
    Productspecification toProductsspecification (EspecificacionProducto especificacionProducto);
    List<Productspecification> toProductsspecification (List<EspecificacionProducto> especificacionProductos);


    @InheritInverseConfiguration
    EspecificacionProducto toEspecificacionproducto (Productspecification productspecification);
}
