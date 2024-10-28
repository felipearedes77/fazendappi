package com.fazendaprojet.fazendapp.request;

import com.fazendaprojet.fazendapp.vendas.Fornecedores;

import java.util.UUID;

public record FornecedoresDTO(int id, String nome, String cnpj, String email, String telefone, String celular, String cep,
                              String endereco) {
    public FornecedoresDTO (Fornecedores fornecedores){
        this(fornecedores.getId(), fornecedores.getNome(), fornecedores.getCnpj(), fornecedores.getEmail(), fornecedores.getTelefone(), fornecedores.getCep(), fornecedores.getComplemento(), fornecedores.getEndereco());
    }
}
