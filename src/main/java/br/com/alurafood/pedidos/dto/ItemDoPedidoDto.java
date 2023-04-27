package br.com.alurafood.pedidos.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemDoPedidoDto {

    private Long id;
    private Integer quantidade;
    private String descricao;
    private List<PedidoDto> pedidos = new ArrayList<>();
}
