package com.weg.loja_de_cosmeticos.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;

public record ProdutoRequisicaoDto(
        @NotBlank(message = "O nome é obrigatório")
        String nome,

        String marca,

        @NotNull(message = "O preço é obrigatório")
        @Min(0)
        BigDecimal preco,

        Integer estoque,

        @NotNull(message = "O categoria_id é obrigatório")
        int categoria_id
) {}