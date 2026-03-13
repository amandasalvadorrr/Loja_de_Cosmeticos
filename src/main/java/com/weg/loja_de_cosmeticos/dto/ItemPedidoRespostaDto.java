package com.weg.loja_de_cosmeticos.dto;

import java.math.BigDecimal;

public record ItemPedidoRespostaDto(
        int id,
        int pedido_id,
        int produto_id,
        int quantidade,
        BigDecimal precoUnitario
) {}