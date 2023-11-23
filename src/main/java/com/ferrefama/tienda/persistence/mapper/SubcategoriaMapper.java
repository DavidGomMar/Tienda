package com.ferrefama.tienda.persistence.mapper;

import com.ferrefama.tienda.domain.Subcategory;
import com.ferrefama.tienda.persistence.entity.Subcategoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring", uses = {CategoriaMapper.class})
public interface SubcategoriaMapper {
    @Mappings({
            @Mapping(source = "idsubcategoria", target = "subcategoriaId"),
            @Mapping(source = "nombresubcategoria", target = "nombresubcategoria"),
            @Mapping(source = "categoria", target = "category")
    })
    Subcategory toSubcategory (Subcategoria subcategoria);
    List<Subcategory> toSubcategory (List<Subcategoria> subcategorias);

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Subcategoria toSubcategoria (Subcategory subcategory);
}
