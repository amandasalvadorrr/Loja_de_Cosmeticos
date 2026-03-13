package com.weg.loja_de_cosmeticos.mapper;

import com.weg.loja_de_cosmeticos.dto.CategoriaRequisicaoDto;
import com.weg.loja_de_cosmeticos.dto.CategoriaRespostaDto;
import com.weg.loja_de_cosmeticos.model.Categoria;

public class CategoriaMapper {
    public static Categoria toModel(CategoriaRequisicaoDto dto) {
        Categoria categoria = new Categoria();
        categoria.setNome(dto.nome());
        categoria.setDescricao(dto.descricao());
        return categoria;
    }

    public static CategoriaRespostaDto toRespostaDto(Categoria categoria) {
        return new CategoriaRespostaDto(
                (int) categoria.getId(),
                categoria.getNome(),
                categoria.getDescricao()
        );
    }
}