package com.ferrefama.tienda.persistence.mapper;

import com.ferrefama.tienda.domain.Brand;
import com.ferrefama.tienda.persistence.entity.Marca;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring")
public interface MarcaMapper {
    @Mappings({
            @Mapping(source = "idmarca", target = "marcaId"),
            @Mapping(source = "nombremarca", target = "nombremarca"),
            @Mapping(source = "rutaimagen", target = "rutaimagen")
    })
    Brand toBrand (Marca marca);
    List<Brand> toBrand (List<Marca> marcas);


    @InheritInverseConfiguration
    @Mapping(target = "submarcas", ignore = true)
    Marca toMarca (Brand brand);
}
