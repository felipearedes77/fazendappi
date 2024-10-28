package com.fazendaprojet.fazendapp.vendas;

import com.fazendaprojet.fazendapp.request.TrueRequest;
import jakarta.persistence.*;
import lombok.*;


@Table(name ="tb_produtos")
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Produtos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String descricao;

    private Double preco;

    private Integer qtd_estoque;

    private String Validade;


    @OneToOne
    @JoinColumn (name = "for_id")
    private Fornecedores for_id;

    public Produtos(TrueRequest data){
        this.descricao = data.descricao();
        this.Validade = getValidade();
        this.qtd_estoque = data.qtd_estoque();
        this.preco = data.preco();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(Integer qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    public String getValidade() {
        return Validade;
    }

    public void setValidade(String validade) {
        this.Validade = validade;
    }

    public Fornecedores getFor_id() {
        return for_id;
    }

    public void setFor_id(Fornecedores for_id) {
        this.for_id = for_id;
    }
}
