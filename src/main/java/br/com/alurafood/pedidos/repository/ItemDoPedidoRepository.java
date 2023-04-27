package br.com.alurafood.pedidos.repository;

import br.com.alurafood.pedidos.model.ItemDoPedido;
import br.com.alurafood.pedidos.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ItemDoPedidoRepository extends JpaRepository<ItemDoPedido, Long> {

//    @Query(value = "SELECT idp from ItemDoPedido idp LEFT JOIN FETCH idp.pedidos where idp.id = :id")
//    ItemDoPedido pedidosDoItem(Long id);

}
