package com.fazendaprojet.fazendapp.vendas;

import com.fazendaprojet.fazendapp.request.RequestFor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name ="tb_fornecedores")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Fornecedores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private String cnpj;

    private String email;

    private String telefone;

    private String celular;

    private String cep;

    private String endereco;

    private int numero;

    private String complemento;

    private String bairro;

    private String  estado;

    public Fornecedores(RequestFor dt) {
        this.nome = dt.nome();
        this.cnpj = dt.cnpj();
        this.email = dt.email();
        this.telefone = dt.telefone();
        this.celular = dt.celular();
        this.cep = dt.cep();
        this.endereco = dt.endereco();
        this.numero = dt.numero();
        this.complemento = dt.complemento();
        this.bairro = dt.bairro();
        this.estado = dt.estado();
    }

}
