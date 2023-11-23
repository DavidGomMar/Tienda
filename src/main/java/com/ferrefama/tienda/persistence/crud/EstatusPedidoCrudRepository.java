package com.ferrefama.tienda.persistence.crud;

import com.ferrefama.tienda.persistence.entity.EstatusPedido;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EstatusPedidoCrudRepository extends CrudRepository<EstatusPedido, Integer> {
    List<EstatusPedido> findByIdestatuspedido (int idEstatuspedido);
    List<EstatusPedido> findByIdestatus (int idEstatus);
    List<EstatusPedido> findBypedido (int idPedido);

}
