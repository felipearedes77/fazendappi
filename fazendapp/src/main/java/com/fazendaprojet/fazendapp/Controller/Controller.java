package com.fazendaprojet.fazendapp.Controller;

import com.fazendaprojet.fazendapp.repositorio.Produtosrepo;
import com.fazendaprojet.fazendapp.request.ProductDTO;
import com.fazendaprojet.fazendapp.request.TrueRequest;
import com.fazendaprojet.fazendapp.vendas.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class Controller {

    @Autowired
    private Produtosrepo repository;


    @PostMapping
    public void saveProduct(@RequestBody TrueRequest data){

        Produtos produtosdata = new Produtos(data);
        repository.save(produtosdata);
        return;
    }


    @GetMapping
    public List<ProductDTO> getAll(){
        List<ProductDTO> produtoList = repository.findAll().stream().map(ProductDTO::new).toList();
        return produtoList;
    }


}
