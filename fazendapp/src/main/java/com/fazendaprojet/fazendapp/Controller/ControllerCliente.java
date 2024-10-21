package com.fazendaprojet.fazendapp.Controller;

import com.fazendaprojet.fazendapp.repositorio.Clientesrepo;
import com.fazendaprojet.fazendapp.request.ClienteDTO;
import com.fazendaprojet.fazendapp.request.ProductDTO;
import com.fazendaprojet.fazendapp.request.ResquestClientes;
import com.fazendaprojet.fazendapp.request.TrueRequest;
import com.fazendaprojet.fazendapp.service.Clientes;
import com.fazendaprojet.fazendapp.vendas.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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


    @GetMapping
    public List<ClienteDTO> getAll(){
        List<ClienteDTO> clienteList = repository.findAll().stream().map(ClienteDTO::new).toList();
        return clienteList;
    }

}
