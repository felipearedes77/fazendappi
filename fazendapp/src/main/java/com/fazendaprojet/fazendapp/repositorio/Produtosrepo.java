package com.fazendaprojet.fazendapp.repositorio;

import com.fazendaprojet.fazendapp.vendas.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface Produtosrepo extends JpaRepository<Produtos , UUID> {
}
