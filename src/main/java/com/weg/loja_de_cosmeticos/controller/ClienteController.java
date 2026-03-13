package com.weg.loja_de_cosmeticos.controller;

import com.weg.loja_de_cosmeticos.dto.ClienteRequisicaoDto;
import com.weg.loja_de_cosmeticos.model.Cliente;
import com.weg.loja_de_cosmeticos.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public Cliente criar(@RequestBody @Valid ClienteRequisicaoDto dto) {
        return clienteService.criarCliente(dto);
    }

    @GetMapping
    public List<Cliente> listar() {
        return clienteService.listarClientes();
    }

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Long id) {
        return clienteService.buscarClientePorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        clienteService.deletarCliente(id);
    }
}