package com.weg.loja_de_cosmeticos.service;

import com.weg.loja_de_cosmeticos.dto.ItemPedidoRequisicaoDto;
import com.weg.loja_de_cosmeticos.mapper.ItemPedidoMapper;
import com.weg.loja_de_cosmeticos.model.ItemPedido;
import com.weg.loja_de_cosmeticos.repository.ItemPedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemPedidoService {
    private final ItemPedidoRepository repository;

    public ItemPedido criarItemPedido(ItemPedidoRequisicaoDto dto) {
        ItemPedido item = ItemPedidoMapper.toModel(dto);
        return repository.save(item);
    }

    public List<ItemPedido> listarItensPedido() {
        return repository.findAll();
    }

    public ItemPedido buscarItemPedidoPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletarItemPedido(Long id) {
        repository.deleteById(id);
    }
}