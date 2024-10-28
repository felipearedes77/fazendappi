package com.fazendaprojet.fazendapp.repositorio;

import com.fazendaprojet.fazendapp.vendas.Clientes;
import com.fazendaprojet.fazendapp.vendas.Fornecedores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface Fornecedoresrepo extends JpaRepository<Fornecedores , Integer> {

}
