package com.weg.loja_de_cosmeticos.service;

import com.weg.loja_de_cosmeticos.dto.PedidoRequisicaoDto;
import com.weg.loja_de_cosmeticos.mapper.PedidoMapper;
import com.weg.loja_de_cosmeticos.model.Pedido;
import com.weg.loja_de_cosmeticos.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PedidoService {
    private final PedidoRepository repository;

    public Pedido criarPedido(PedidoRequisicaoDto dto) {
        Pedido pedido = PedidoMapper.toModel(dto);
        return repository.save(pedido);
    }

    public List<Pedido> listarPedidos() {
        return repository.findAll();
    }

    public Pedido buscarPedidoPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletarPedido(Long id) {
        repository.deleteById(id);
    }
}