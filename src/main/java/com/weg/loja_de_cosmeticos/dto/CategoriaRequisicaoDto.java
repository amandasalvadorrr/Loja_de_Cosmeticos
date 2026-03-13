package com.weg.loja_de_cosmeticos.dto;

import jakarta.validation.constraints.NotBlank;

public record CategoriaRequisicaoDto(
        @NotBlank(message = "O nome é obrigatório")
        String nome,

        String descricao
) {}