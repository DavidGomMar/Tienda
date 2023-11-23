package com.ferrefama.tienda.persistence;

import com.ferrefama.tienda.persistence.crud.InventarioCrudRepository;
import com.ferrefama.tienda.persistence.entity.Inventario;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class InventarioRepository {
    private InventarioCrudRepository inventarioCrudRepository;

    public List<Inventario> getAll(){
        return (List<Inventario>) inventarioCrudRepository.findAll();
    }

    //public List<Inventario> getByInventario(int idLoginventario){
      //  return inventarioCrudRepository.findByIdloginventario(idLoginventario);
    //}

    public List<Inventario> getByProducto(int idProducto){
        return inventarioCrudRepository.findByIdproducto(idProducto);
    }

    public List<Inventario> getByUsuario(int idUsuario){
        return inventarioCrudRepository.findByIdusuario(idUsuario);
    }

    public Optional<Inventario> getInventario(int idInventario){
        return inventarioCrudRepository.findById(idInventario);
    }

    public Inventario save(Inventario inventario){
        return inventarioCrudRepository.save(inventario);
    }

    public void delete(int idInventario) {
        inventarioCrudRepository.deleteById(idInventario);
    }
}
