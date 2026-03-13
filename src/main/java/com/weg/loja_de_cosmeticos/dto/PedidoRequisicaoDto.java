package com.weg.loja_de_cosmeticos.dto;

import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

public record PedidoRequisicaoDto(
        @NotNull(message = "O cliente_id é obrigatório")
        int cliente_id,

        LocalDate dataPedido,

        BigDecimal total
) {}