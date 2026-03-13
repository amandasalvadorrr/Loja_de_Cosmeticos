package com.weg.loja_de_cosmeticos.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record PedidoRespostaDto(
        int id,
        int cliente_id,
        LocalDate dataPedido,
        BigDecimal total
) {}