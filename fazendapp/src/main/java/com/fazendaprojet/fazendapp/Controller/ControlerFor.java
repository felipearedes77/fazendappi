package com.fazendaprojet.fazendapp.Controller;

import com.fazendaprojet.fazendapp.repositorio.Fornecedoresrepo;
import com.fazendaprojet.fazendapp.request.FornecedoresDTO;
import com.fazendaprojet.fazendapp.request.RequestFor;
import com.fazendaprojet.fazendapp.vendas.Clientes;
import com.fazendaprojet.fazendapp.vendas.Fornecedores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fornecedores")
public class ControlerFor {
    @Autowired
    private Fornecedoresrepo fornecedoresrepo;

    @PostMapping
    public void saveFornecedor(@RequestBody RequestFor dt){
        Fornecedores fornecedoresdata = new Fornecedores(dt);
        fornecedoresrepo.save(fornecedoresdata);
    }

    @GetMapping
    public List<FornecedoresDTO> getAll(){
        List<FornecedoresDTO> fornecedoresList = fornecedoresrepo.findAll().stream().map(FornecedoresDTO::new).toList();
        return fornecedoresList;
    }

}
