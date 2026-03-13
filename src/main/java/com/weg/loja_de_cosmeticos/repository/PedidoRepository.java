package com.weg.loja_de_cosmeticos.repository;

import com.weg.loja_de_cosmeticos.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {}