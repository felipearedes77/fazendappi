package com.fazendaprojet.fazendapp.service;

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
@AllArgsConstructor
@NoArgsConstructor

public class Fornecedores {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uniqueidentifier")
    private UUID id;

    private String nome;

    private int rg;

    private int cpf;

    private String email;

    private int telefone;

    private int celular;

    private int cep;

    private String endereco;

    private int numero;

    private String complemento;

    private String bairro;

    private String  estado;
}
