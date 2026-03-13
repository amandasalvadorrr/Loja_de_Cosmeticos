package com.weg.loja_de_cosmeticos.controller;

import com.weg.loja_de_cosmeticos.dto.ItemPedidoRequisicaoDto;
import com.weg.loja_de_cosmeticos.model.ItemPedido;
import com.weg.loja_de_cosmeticos.service.ItemPedidoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/item-pedido")
public class ItemPedidoController {
    private final ItemPedidoService itemPedidoService;

    public ItemPedidoController(ItemPedidoService itemPedidoService) {
        this.itemPedidoService = itemPedidoService;
    }

    @PostMapping
    public ItemPedido criar(@RequestBody @Valid ItemPedidoRequisicaoDto dto) {
        return itemPedidoService.criarItemPedido(dto);
    }

    @GetMapping
    public List<ItemPedido> listar() {
        return itemPedidoService.listarItensPedido();
    }

    @GetMapping("/{id}")
    public ItemPedido buscarPorId(@PathVariable Long id) {
        return itemPedidoService.buscarItemPedidoPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        itemPedidoService.deletarItemPedido(id);
    }
}