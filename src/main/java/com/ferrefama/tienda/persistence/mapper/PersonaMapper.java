package com.ferrefama.tienda.persistence.mapper;

import com.ferrefama.tienda.domain.Person;
import com.ferrefama.tienda.persistence.entity.Persona;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring")
public interface PersonaMapper {
    @Mappings({
            @Mapping(source = "idpersona", target = "personaId"),
            @Mapping(source = "nombrepersona", target = "nombrepersona"),
            @Mapping(source = "apellidopaterno", target = "apellidopaterno"),
            @Mapping(source = "apellidomaterno", target = "apellidomaterno"),
            @Mapping(source = "telefono_persona", target = "telefono_persona")
    })
    Person toPerson (Persona persona);
    List<Person> toPerson (List<Persona> personas);

    @InheritInverseConfiguration
    @Mapping(target = "usuarios", ignore = true)
    @Mapping(target = "direccionUsuarios", ignore = true)
    Persona toPersona (Person person);
}
