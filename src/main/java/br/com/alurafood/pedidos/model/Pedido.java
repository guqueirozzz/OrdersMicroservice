package br.com.alurafood.pedidos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pedidos")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private LocalDateTime dataHora;

    @NotNull @Enumerated(EnumType.STRING)
    private Status status;

//    @JsonIgnore
//    @OneToMany(cascade=CascadeType.PERSIST, mappedBy="pedido")
//    private List<ItemDoPedido> itens = new ArrayList<>();

    @ManyToOne(optional=false)
    private ItemDoPedido item;

}
