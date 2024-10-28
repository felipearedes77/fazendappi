package com.fazendaprojet.fazendapp.repositorio;

import com.fazendaprojet.fazendapp.vendas.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface Clientesrepo extends JpaRepository<Clientes , Integer> {
    Optional<Clientes> findByEmail(String email);

}
