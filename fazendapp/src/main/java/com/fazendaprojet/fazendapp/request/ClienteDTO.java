package com.fazendaprojet.fazendapp.request;

import com.fazendaprojet.fazendapp.vendas.Clientes;


public record ClienteDTO(int id, String nome, String rg, String cpf, String email, String telefone, String celular, String cep,
                         String endereco, String complemento) {
    public ClienteDTO(Clientes clientes) {
        this(
                clientes.getId(),
                clientes.getNome(),
                clientes.getRg(),
                clientes.getCpf(),
                clientes.getEmail(),
                clientes.getTelefone(),
                clientes.getCelular(),
                clientes.getCep(),
                clientes.getEndereco(),
                clientes.getComplemento()
        );
    }
}


