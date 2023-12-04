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
@Table (name = "Cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private String cpf;
    private String cnh;

    private String telefone;


}
