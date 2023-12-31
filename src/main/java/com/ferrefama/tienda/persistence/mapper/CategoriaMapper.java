package com.ferrefama.tienda.persistence.mapper;


import com.ferrefama.tienda.domain.Category;
import com.ferrefama.tienda.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {FamiliaMapper.class})
public interface CategoriaMapper {
    @Mappings({
            @Mapping(source = "idcategoria", target = "categoriaId"),
            @Mapping(source = "nombrecategoria", target = "categoria"),
            @Mapping(source = "familia", target = "family")
    })
    Category toCategory(Categoria categoria);
    List<Category> toCategorys(List<Categoria> categorias);

    @InheritInverseConfiguration
    @Mapping(target = "subcategorias", ignore = true)
    Categoria toCategoria(Category category);
}
