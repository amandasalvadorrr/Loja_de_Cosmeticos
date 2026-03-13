package com.weg.loja_de_cosmeticos.repository;

import com.weg.loja_de_cosmeticos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {}