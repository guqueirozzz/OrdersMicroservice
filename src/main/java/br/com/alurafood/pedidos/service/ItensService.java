package br.com.alurafood.pedidos.service;


import br.com.alurafood.pedidos.dto.ItemDoPedidoDto;
import br.com.alurafood.pedidos.dto.PedidoDto;
import br.com.alurafood.pedidos.model.ItemDoPedido;
import br.com.alurafood.pedidos.model.Pedido;
import br.com.alurafood.pedidos.repository.ItemDoPedidoRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ItensService {

    @Autowired
    private ItemDoPedidoRepository itemDoPedidoRepository;

    @Autowired
    private ModelMapper modelMapper;

    public ItemDoPedidoDto obterPorId(Long id) {

        ItemDoPedido itemDoPedido = itemDoPedidoRepository.findById(id)
                .orElseThrow(EntityNotFoundException::new);

        return  modelMapper.map(itemDoPedido, ItemDoPedidoDto.class);

    }

    public List<ItemDoPedidoDto> obterTodos() {

        return itemDoPedidoRepository.findAll().stream()
                .map(p -> modelMapper.map(p, ItemDoPedidoDto.class))
                .collect(Collectors.toList());
    }

}
