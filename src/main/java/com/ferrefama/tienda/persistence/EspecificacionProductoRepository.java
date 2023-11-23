package com.ferrefama.tienda.persistence;

import com.ferrefama.tienda.persistence.crud.EspecificacionProductoCrudRepository;
import com.ferrefama.tienda.persistence.entity.EspecificacionProducto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EspecificacionProductoRepository {
    private EspecificacionProductoCrudRepository especificacionProductoCrudRepository;

    public List<EspecificacionProducto> getAll(){
        return (List<EspecificacionProducto>) especificacionProductoCrudRepository.findAll();
    }

    public List<EspecificacionProducto> getByEspecificacion(int idEspecificacion){
        return especificacionProductoCrudRepository.findByIdEspecificacion(idEspecificacion);
    }

    public List<EspecificacionProducto> getByProducto(int idProducto){
        return especificacionProductoCrudRepository.findByIdProducto(idProducto);
    }



    public Optional<EspecificacionProducto> getEspecificacion_producto(int idEspecificacion_producto){
        return especificacionProductoCrudRepository.findById(idEspecificacion_producto);
    }

    public EspecificacionProducto save(EspecificacionProducto especificacionProducto){
        return especificacionProductoCrudRepository.save(especificacionProducto);
    }

    public void delete(int idEspecificacion_producto){
        especificacionProductoCrudRepository.deleteById(idEspecificacion_producto);
    }

}
