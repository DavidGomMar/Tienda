package com.ferrefama.tienda.persistence;

import com.ferrefama.tienda.persistence.crud.EstatusPedidoCrudRepository;
import com.ferrefama.tienda.persistence.entity.EstatusPedido;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EstatusPedidoRepository {
    private EstatusPedidoCrudRepository estatusPedidoCrudRepository;

    public List<EstatusPedido> getAll(){
        return (List<EstatusPedido>) estatusPedidoCrudRepository.findAll();
    }

    //public List<EstatusPedido> getByEstatuspedido (int idEstatuspedido){
      //  return estatusPedidoCrudRepository.findByIdestatuspedido(idEstatuspedido);
    //}
    public List<EstatusPedido> getByEstatus (int idEstatus){
        return estatusPedidoCrudRepository.findByIdestatus(idEstatus);
    }

    public List<EstatusPedido> getBypedido(int idPedido){
        return estatusPedidoCrudRepository.findBypedido(idPedido);
    }

    public Optional<EstatusPedido> getEstatuspedido(int idEstatuspedido){
        return estatusPedidoCrudRepository.findById(idEstatuspedido);
    }

    public EstatusPedido save(EstatusPedido estatusPedido){
        return estatusPedidoCrudRepository.save(estatusPedido);
    }

    public void delete(int idEstatuspedido){
        estatusPedidoCrudRepository.deleteById(idEstatuspedido);
    }
}
