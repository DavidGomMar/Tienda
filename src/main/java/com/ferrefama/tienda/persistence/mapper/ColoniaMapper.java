package com.ferrefama.tienda.persistence.mapper;

import com.ferrefama.tienda.domain.Colony;
import com.ferrefama.tienda.persistence.entity.Categoria;
import com.ferrefama.tienda.persistence.entity.Colonia;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring")
public interface ColoniaMapper {
    @Mappings({
            @Mapping(source = "idcolonia", target = "coloniaId"),
            @Mapping(source = "nombre_colonia", target = "nombre"),
    })
    Colony toColony(Colonia colonia);
    List<Colony> toColonys(List<Categoria> categorias);


    @InheritInverseConfiguration
    @Mapping(target = "direccions", ignore = true)
    Colonia toColonia(Colony colony);
}
