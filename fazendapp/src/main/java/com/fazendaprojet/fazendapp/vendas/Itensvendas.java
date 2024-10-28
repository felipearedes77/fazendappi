package com.fazendaprojet.fazendapp.vendas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name ="tb_itensvendas")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Itensvendas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn (name= "fk_vendas" , referencedColumnName = "id")
    private Vendas venda_id;

    @OneToOne
    @JoinColumn (name= "fk_produtos")
    private Produtos produto;

    private Integer qtd;

    private boolean subtotal;

}