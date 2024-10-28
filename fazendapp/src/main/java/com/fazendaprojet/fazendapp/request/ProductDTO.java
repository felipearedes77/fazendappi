package com.fazendaprojet.fazendapp.request;

import com.fazendaprojet.fazendapp.vendas.Fornecedores;
import com.fazendaprojet.fazendapp.vendas.Produtos;

public record ProductDTO(String descricao , Double preco , Integer qtd_estoque , Integer id , Fornecedores for_id , String Validade) {
    public ProductDTO (Produtos produtos){
        this(produtos.getDescricao(), produtos.getPreco(), produtos.getQtd_estoque(), produtos.getId() , produtos.getFor_id() , produtos.getValidade());
    }


}
