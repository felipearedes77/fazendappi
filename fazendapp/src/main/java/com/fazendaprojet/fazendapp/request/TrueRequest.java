package com.fazendaprojet.fazendapp.request;

import com.fazendaprojet.fazendapp.service.Fornecedores;

import java.util.Date;
import java.util.UUID;

public record TrueRequest(String descricao, double preco, Integer qtd_estoque , String validade , Fornecedores for_id) {
}
