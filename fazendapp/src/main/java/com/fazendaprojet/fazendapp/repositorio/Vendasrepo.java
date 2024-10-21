package com.fazendaprojet.fazendapp.repositorio;

import com.fazendaprojet.fazendapp.vendas.Vendas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface Vendasrepo extends JpaRepository<Vendas , UUID>{
}
