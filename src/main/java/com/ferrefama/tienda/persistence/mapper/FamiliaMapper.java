package com.ferrefama.tienda.persistence.mapper;


import com.ferrefama.tienda.domain.Family;
import com.ferrefama.tienda.persistence.entity.Familia;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring")
public interface FamiliaMapper {
    @Mappings({
            @Mapping(source = "idfamilia", target = "familiaId"),
            @Mapping(source = "nombrefamilia", target = "nombre")
    })
    Family toFamily (Familia familia);
    List<Family> toFamily (List<Familia> familias);

    @InheritInverseConfiguration
    @Mapping(target = "categorias", ignore = true)
    Familia toFamilia (Family family);
}
