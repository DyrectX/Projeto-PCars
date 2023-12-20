package com.projectcars.main.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/*
 * @author Diego Luz
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "Venda")
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente nomeCliente;
    @ManyToOne
    @JoinColumn(name = "veiculo_id")
    private Veiculo veiculoVendido;
    private String valor;
    private String parcelas;


}
