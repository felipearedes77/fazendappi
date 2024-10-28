package com.fazendaprojet.fazendapp.Controller;

import com.fazendaprojet.fazendapp.repositorio.Clientesrepo;
import com.fazendaprojet.fazendapp.request.ClienteDTO;
import com.fazendaprojet.fazendapp.request.ProductDTO;
import com.fazendaprojet.fazendapp.request.ResquestClientes;
import com.fazendaprojet.fazendapp.service.ClienteService;
import com.fazendaprojet.fazendapp.vendas.Clientes;
import com.fazendaprojet.fazendapp.vendas.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ControllerCliente {
    @Autowired
    private Clientesrepo repository;

    @PostMapping
    public void saveCliente(@RequestBody ResquestClientes dt){

        Clientes clientedata = new Clientes (dt);
        repository.save(clientedata);
    }
    @GetMapping("/email/{email}")
    public ResponseEntity<Clientes> getClienteByEmail(@PathVariable String email) {
        Optional<Clientes> cliente = repository.findByEmail(email);
        return cliente.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @GetMapping
    public List<ClienteDTO> getAll(){
        List<ClienteDTO> clienteList = repository.findAll().stream().map(ClienteDTO::new).toList();
        return clienteList;
    }
    @PutMapping("/{email}")
    public ResponseEntity<Boolean> updateClienteByEmail(
            @PathVariable String email,
            @RequestBody Clientes clienteUpdate) {

        Optional<Clientes> clienteOptional = repository.findByEmail(email);

        if (clienteOptional.isPresent()) {
            Clientes cliente = clienteOptional.get();
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

            repository.save(cliente); // Salva a instância atualizada do cliente
            return ResponseEntity.ok(true);
        }

        return ResponseEntity.notFound().build();
    }
}
