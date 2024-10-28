package com.fazendaprojet.fazendapp.service;

import com.fazendaprojet.fazendapp.repositorio.Clientesrepo;
import com.fazendaprojet.fazendapp.vendas.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ClienteService {
    @Autowired
    private static Clientesrepo clienteRepository;

    public static boolean updateCliente(Clientes clienteUpdate) {

        Optional<Clientes> clientesOptional = clienteRepository.findByEmail(clienteUpdate.getEmail()); // Ou outra forma de encontrar o cliente
        if (clientesOptional.isPresent()) {
            Clientes cliente = clientesOptional.get();
            cliente.setNome(clienteUpdate.getNome());
            cliente.setRg(clienteUpdate.getRg());
            cliente.setCpf(clienteUpdate.getCpf());
            cliente.setTelefone(clienteUpdate.getTelefone());
            cliente.setCelular(clienteUpdate.getCelular());
            cliente.setCep(clienteUpdate.getCep());
            cliente.setEndereco(clienteUpdate.getEndereco());
            cliente.setComplemento(clienteUpdate.getComplemento());
            cliente.setNumero(clienteUpdate.getNumero());
            cliente.setBairro(clienteUpdate.getBairro());
            cliente.setEstado(clienteUpdate.getEstado());

            clienteRepository.save(cliente);
            return true;
        }
        return false;
    }
}
