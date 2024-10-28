package com.fazendaprojet.fazendapp.vendas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Table(name ="tb_vendas")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vendas {
    @Id
    @GeneratedValue
    private int id;

    @OneToOne
    @JoinColumn(name= "fk_cliente")
    private Clientes idcliente;

    @OneToOne
    @JoinColumn(name= "fk_produtos")
    private Produtos idprodutos;


    private Date data_venda;

    private boolean total_vendas;

    private String observacoes;


}
