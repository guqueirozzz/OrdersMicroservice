package br.com.alurafood.pedidos.amqp;

import br.com.alurafood.pedidos.dto.PagamentoDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PagamentoListener {

    @RabbitListener(queues = "pagamentos.detalhes-pedido") // -> De qual fila vou receber e mensagem?
    public void recebeMensagem(PagamentoDTO pagamentoDTO) {

        String mensagem = """
                Dados do pagamento: %s 
                Numero do pedido: %s
                Valor: R$ %s
                Status: %s
                """.formatted(pagamentoDTO.getId(),
                pagamentoDTO.getPedidoId(),
                pagamentoDTO.getValor(),
                pagamentoDTO.getStatus());

        System.out.println("Recebi a mensagem: " + mensagem);

    }

}
