package com.weg.loja_de_cosmeticos.service;

import com.weg.loja_de_cosmeticos.dto.ClienteRequisicaoDto;
import com.weg.loja_de_cosmeticos.mapper.ClienteMapper;
import com.weg.loja_de_cosmeticos.model.Cliente;
import com.weg.loja_de_cosmeticos.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteService {
    private final ClienteRepository repository;

    public Cliente criarCliente(ClienteRequisicaoDto dto) {
        Cliente cliente = ClienteMapper.toModel(dto);
        return repository.save(cliente);
    }

    public List<Cliente> listarClientes() {
        return repository.findAll();
    }

    public Cliente buscarClientePorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletarCliente(Long id) {
        repository.deleteById(id);
    }
}