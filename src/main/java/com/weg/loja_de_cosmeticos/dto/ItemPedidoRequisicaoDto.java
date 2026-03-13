package com.weg.loja_de_cosmeticos.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;

public record ItemPedidoRequisicaoDto(
        @NotNull(message = "O pedido_id é obrigatório")
        int pedido_id,

        @NotNull(message = "O produto_id é obrigatório")
        int produto_id,

        @Min(1)
        int quantidade,

        BigDecimal precoUnitario
) {}