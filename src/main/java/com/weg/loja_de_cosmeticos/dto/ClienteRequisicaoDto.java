package com.weg.loja_de_cosmeticos.dto;

import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate;

public record ClienteRequisicaoDto(
        @NotBlank(message = "O nome é obrigatório")
        String nome,

        @NotBlank(message = "O email é obrigatório")
        String email,

        String telefone,

        LocalDate dataCadastro
) {}