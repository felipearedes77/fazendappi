package com.fazendaprojet.fazendapp.repositorio;

import com.fazendaprojet.fazendapp.service.Fornecedores;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface Fornecedoresrepo extends JpaRepository<Fornecedores , UUID> {
}
