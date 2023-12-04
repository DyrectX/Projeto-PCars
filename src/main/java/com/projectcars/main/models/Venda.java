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
    private String nome_cliente;
    private String veiculo;
    private float valor;

    private int parcelas;


}
