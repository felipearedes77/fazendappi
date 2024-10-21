package com.fazendaprojet.fazendapp.repositorio;

import com.fazendaprojet.fazendapp.vendas.Itensvendas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface Itensrepo extends JpaRepository<Itensvendas , UUID> {
}
