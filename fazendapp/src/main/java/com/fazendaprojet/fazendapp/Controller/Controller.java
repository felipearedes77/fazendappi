package com.fazendaprojet.fazendapp.Controller;

import com.fazendaprojet.fazendapp.repositorio.Produtosrepo;
import com.fazendaprojet.fazendapp.request.ProductDTO;
import com.fazendaprojet.fazendapp.request.TrueRequest;
import com.fazendaprojet.fazendapp.vendas.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class Controller {

    @Autowired
    private Produtosrepo repository;
    private Record record;


    @PostMapping
    public void saveProduct(@RequestBody TrueRequest data){

        Produtos produtosdata = new Produtos(data);
        repository.save(produtosdata);
        return;
    }
    @GetMapping("/{id}")
    @Query("SELECT p.id AS id, p.descricao AS descricao, p.preco AS preco, p.qtd_Estoque AS qtd_Estoque, f.id AS for_Id "
            + "FROM Produtos p LEFT JOIN p.fornecedor f WHERE p.id = :id")//procurar por id
    public ResponseEntity<Produtos> findById(@PathVariable Integer id){
     return repository.findById(id)
        .map(record -> ResponseEntity.ok().body(record))
             .orElse(ResponseEntity.notFound().build());
    }
    @GetMapping //listar todos
    public List<ProductDTO> getAll(){
        List<ProductDTO> produtoList = repository.findAll().stream().map(ProductDTO::new).toList();
        return produtoList;
    }


    @PutMapping("/{id}")
    public ResponseEntity<Produtos> updateProdutos(@PathVariable Integer id ,  @RequestBody ProductDTO data){
        Optional<Produtos> existingProductOpt = repository.findById(id);

        if (!existingProductOpt.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        Produtos produtos = existingProductOpt.get();

        produtos.setPreco(data.preco());
        produtos.setQtd_estoque(data.qtd_estoque());

        Produtos updatedProduct = repository.save(produtos);

        return ResponseEntity.ok(updatedProduct);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Produtos> update(@PathVariable Integer id, @RequestBody ProductDTO data){
        Optional<Produtos> existingProductOpt = repository.findById(id);

        if (!existingProductOpt.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        Produtos existingProduct = existingProductOpt.get();


        if (data.descricao() != null) {
            existingProduct.setDescricao(data.descricao());
        }
        if (data.preco() != null) {
            existingProduct.setPreco(data.preco());
        }
        if (data.qtd_estoque() != null) {
            existingProduct.setQtd_estoque(data.qtd_estoque());
        }
        if (data.Validade() != null) {
            existingProduct.setValidade(data.Validade());
        }


        Produtos updatedProduct = repository.save(existingProduct);
        return ResponseEntity.ok(updatedProduct);

    }

}
