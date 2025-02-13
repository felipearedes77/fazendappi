package com.fazendaprojet.fazendapp.vendas;

import com.fazendaprojet.fazendapp.request.ResquestClientes;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name ="tb_clientes")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    private String rg;

    private String cpf;

    private String email;

    private String telefone;

    private String cep;

    private String celular;

    private String endereco;

    private int numero;

    private String complemento;

    private String bairro;

    private String  estado;

    public Clientes(ResquestClientes dt){
            this.nome = dt.nome();
            this.email = dt.email();
            this.cep = dt.cep();
            this.endereco = dt.endereco();

    }
}
