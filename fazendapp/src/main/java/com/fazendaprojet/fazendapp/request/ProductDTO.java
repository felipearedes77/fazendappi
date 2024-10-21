package com.fazendaprojet.fazendapp.request;

import com.fazendaprojet.fazendapp.service.Fornecedores;
import com.fazendaprojet.fazendapp.vendas.Produtos;

import java.util.UUID;

public record ProductDTO(String descricao , double preco , Integer qtd_estoque , UUID id , Fornecedores for_id , String Validade) {
    public ProductDTO (Produtos produtos){
        this(produtos.getDescricao(), produtos.getPreco(), produtos.getQtd_estoque(), produtos.getId() , produtos.getFor_id() , produtos.getValidade());
    }


}
