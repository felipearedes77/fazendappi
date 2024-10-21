package com.fazendaprojet.fazendapp.repositorio;

import com.fazendaprojet.fazendapp.service.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface Clientesrepo extends JpaRepository<Clientes , UUID> {
}
