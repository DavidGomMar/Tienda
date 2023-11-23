package com.ferrefama.tienda.persistence.mapper;

import com.ferrefama.tienda.domain.ProductOrder;
import com.ferrefama.tienda.persistence.entity.PedidoProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring", uses = {ProductoMapper.class, PedidoMapper.class})
public interface PedidoProductoMapper {
    @Mappings({
            @Mapping(source = "idpedidoproducto", target = "pedidoproductoId"),
            @Mapping(source = "producto", target = "product"),
            @Mapping(source = "pedido", target = "order")
    })
    ProductOrder toProductorder (PedidoProducto pedidoProducto);
    List<ProductOrder> toProductorder (List<PedidoProducto> pedidoProductos);

    @InheritInverseConfiguration
    PedidoProducto toPedidoproducto (ProductOrder productOrder);
}
