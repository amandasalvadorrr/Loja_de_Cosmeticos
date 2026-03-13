package com.weg.loja_de_cosmeticos.repository;

import com.weg.loja_de_cosmeticos.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {}