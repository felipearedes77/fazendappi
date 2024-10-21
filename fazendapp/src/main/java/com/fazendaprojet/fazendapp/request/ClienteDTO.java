package com.fazendaprojet.fazendapp.request;

import com.fazendaprojet.fazendapp.service.Clientes;

import java.util.UUID;

public record ClienteDTO(UUID id, String nome, String rg, String cpf, String email, String telefone, String celular, String cep,
                         String endereco, int numero, String complemento, String bairro, String estado) {

    public ClienteDTO(Clientes clientes) {
        this(clientes.getId(), clientes.getNome(), clientes.getRg(), clientes.getCpf(), clientes.getEmail(),
                clientes.getTelefone(), clientes.getCelular(), clientes.getCep(), clientes.getEndereco(),
                clientes.getNumero(), clientes.getComplemento(), clientes.getBairro(), clientes.getEstado());
    }
}


