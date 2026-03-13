package com.weg.loja_de_cosmeticos.controller;

import com.weg.loja_de_cosmeticos.dto.PedidoRequisicaoDto;
import com.weg.loja_de_cosmeticos.model.Pedido;
import com.weg.loja_de_cosmeticos.service.PedidoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    public Pedido criar(@RequestBody @Valid PedidoRequisicaoDto dto) {
        return pedidoService.criarPedido(dto);
    }

    @GetMapping
    public List<Pedido> listar() {
        return pedidoService.listarPedidos();
    }

    @GetMapping("/{id}")
    public Pedido buscarPorId(@PathVariable Long id) {
        return pedidoService.buscarPedidoPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        pedidoService.deletarPedido(id);
    }
}