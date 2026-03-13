package com.weg.loja_de_cosmeticos.mapper;

import com.weg.loja_de_cosmeticos.dto.ProdutoRequisicaoDto;
import com.weg.loja_de_cosmeticos.dto.ProdutoRespostaDto;
import com.weg.loja_de_cosmeticos.model.Produto;

public class ProdutoMapper {
    public static Produto toModel(ProdutoRequisicaoDto dto) {
        Produto produto = new Produto();
        produto.setNome(dto.nome());
        produto.setMarca(dto.marca());
        produto.setPreco(dto.preco());
        produto.setEstoque(dto.estoque());
        produto.setCategoria_id(dto.categoria_id());
        return produto;
    }

    public static ProdutoRespostaDto toRespostaDto(Produto produto) {
        return new ProdutoRespostaDto(
                (int) produto.getId(),
                produto.getNome(),
                produto.getMarca(),
                produto.getPreco(),
                produto.getEstoque(),
                produto.getCategoria_id()
        );
    }
}