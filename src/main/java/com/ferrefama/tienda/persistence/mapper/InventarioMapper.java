package com.ferrefama.tienda.persistence.mapper;


import com.ferrefama.tienda.domain.Inventory;
import com.ferrefama.tienda.persistence.entity.Inventario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring", uses = {UsuarioMapper.class, ProductoMapper.class})
public interface InventarioMapper {
    @Mappings({
            @Mapping(source = "idloginventario", target = "inventarioId"),
            @Mapping(source = "cantidadanteriorinventario", target = "cantidadanteriorinventario"),
            @Mapping(source = "cantidadnuevoinventario", target = "cantidadnuevoinventario"),
            @Mapping(source = "fechamovimiento", target = "fechamovimiento"),
            @Mapping(source = "usuario", target = "user"),
            @Mapping(source = "producto", target = "producto")
    })
    Inventory toInventory(Inventario inventario);
    List<Inventory> toInventory (List<Inventario> inventarios);

    @InheritInverseConfiguration
    Inventario toInventario (Inventory inventory);
}
