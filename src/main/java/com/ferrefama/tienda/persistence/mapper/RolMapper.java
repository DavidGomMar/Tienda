package com.ferrefama.tienda.persistence.mapper;

import com.ferrefama.tienda.domain.Role;
import com.ferrefama.tienda.persistence.entity.Rol;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring")
public interface RolMapper {
    @Mappings({
            @Mapping(source = "idrol", target = "rolId"),
            @Mapping(source = "nomberol", target = "nomberol"),
            @Mapping(source = "descripcionrol", target = "descripcionrol")
    })
    Role toRole (Rol rol);
    List<Role> toRole (List<Rol> rols);

    @InheritInverseConfiguration
    @Mapping(target = "usuarios", ignore = true)
    Rol toRol (Role role);
}
