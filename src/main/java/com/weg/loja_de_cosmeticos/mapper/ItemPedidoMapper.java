package com.weg.loja_de_cosmeticos.mapper;

import com.weg.loja_de_cosmeticos.dto.ItemPedidoRequisicaoDto;
import com.weg.loja_de_cosmeticos.dto.ItemPedidoRespostaDto;
import com.weg.loja_de_cosmeticos.model.ItemPedido;

public class ItemPedidoMapper {
    public static ItemPedido toModel(ItemPedidoRequisicaoDto dto) {
        ItemPedido item = new ItemPedido();
        item.setPedido_id(dto.pedido_id());
        item.setProduto_id(dto.produto_id());
        item.setQuantidade(dto.quantidade());
        item.setPrecoUnitario(dto.precoUnitario());
        return item;
    }

    public static ItemPedidoRespostaDto toRespostaDto(ItemPedido item) {
        return new ItemPedidoRespostaDto(
                (int) item.getId(),
                item.getPedido_id(),
                item.getProduto_id(),
                item.getQuantidade(),
                item.getPrecoUnitario()
        );
    }
}