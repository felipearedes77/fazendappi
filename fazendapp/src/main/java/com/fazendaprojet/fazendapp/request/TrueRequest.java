package com.fazendaprojet.fazendapp.request;

import com.fazendaprojet.fazendapp.vendas.Fornecedores;

public record TrueRequest(String descricao, double preco, Integer qtd_estoque , String Validade , Fornecedores for_id) {
}
