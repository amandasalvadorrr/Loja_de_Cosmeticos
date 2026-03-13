package com.weg.loja_de_cosmeticos.repository;

import com.weg.loja_de_cosmeticos.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {}