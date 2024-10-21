package com.fazendaprojet.fazendapp.vendas;

import com.fazendaprojet.fazendapp.request.TrueRequest;
import com.fazendaprojet.fazendapp.service.Fornecedores;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;


@Table(name ="tb_produtos")
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Produtos {
    @Id
    @GeneratedValue
    private UUID id;

    private String descricao;

    private double preco;

    private Integer qtd_estoque;

    private String validade;


    @OneToOne
    @JoinColumn (name = "for_id")
    private Fornecedores for_id;

    public Produtos(TrueRequest data){
        this.descricao = data.descricao();
        this.validade = getValidade();
        this.qtd_estoque = data.qtd_estoque();
        this.preco = data.preco();
    }


}
