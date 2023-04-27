package br.com.alurafood.pedidos.controller;

import br.com.alurafood.pedidos.dto.ItemDoPedidoDto;
import br.com.alurafood.pedidos.dto.PedidoDto;
import br.com.alurafood.pedidos.service.ItensService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("/item-do-pedido")
public class ItemDoPedidoController {

    @Autowired
    private ItensService service;

    @GetMapping("/{id}")
    public ResponseEntity<ItemDoPedidoDto> obterPorId(@PathVariable @NotNull Long itemId) {

        ItemDoPedidoDto dto = service.obterPorId(itemId);

        return  ResponseEntity.ok(dto);
    }

    @GetMapping()
    public List<ItemDoPedidoDto> obterTodos() {

        return service.obterTodos();
    }

}
