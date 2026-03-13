package com.weg.loja_de_cosmeticos.dto;

import java.time.LocalDate;

public record ClienteRespostaDto(
        int id,
        String nome,
        String email,
        String telefone,
        LocalDate dataCadastro
) {}