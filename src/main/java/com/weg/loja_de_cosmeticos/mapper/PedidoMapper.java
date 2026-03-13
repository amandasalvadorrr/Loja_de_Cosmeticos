package com.weg.loja_de_cosmeticos.mapper;

import com.weg.loja_de_cosmeticos.dto.PedidoRequisicaoDto;
import com.weg.loja_de_cosmeticos.dto.PedidoRespostaDto;
import com.weg.loja_de_cosmeticos.model.Pedido;

public class PedidoMapper {
    public static Pedido toModel(PedidoRequisicaoDto dto) {
        Pedido pedido = new Pedido();
        pedido.setCliente_id(dto.cliente_id());
        pedido.setDataPedido(dto.dataPedido());
        pedido.setTotal(dto.total());
        return pedido;
    }

    public static PedidoRespostaDto toRespostaDto(Pedido pedido) {
        return new PedidoRespostaDto(
                (int) pedido.getId(),
                pedido.getCliente_id(),
                pedido.getDataPedido(),
                pedido.getTotal()
        );
    }
}