package com.weg.loja_de_cosmeticos.dto;

import java.math.BigDecimal;

public record ProdutoRespostaDto(
        int id,
        String nome,
        String marca,
        BigDecimal preco,
        Integer estoque,
        int categoria_id
) {}