package com.weg.loja_de_cosmeticos.mapper;

import com.weg.loja_de_cosmeticos.dto.ClienteRequisicaoDto;
import com.weg.loja_de_cosmeticos.dto.ClienteRespostaDto;
import com.weg.loja_de_cosmeticos.model.Cliente;

public class ClienteMapper {
    public static Cliente toModel(ClienteRequisicaoDto dto) {
        Cliente cliente = new Cliente();
        cliente.setNome(dto.nome());
        cliente.setEmail(dto.email());
        cliente.setTelefone(dto.telefone());
        cliente.setDataCadastro(dto.dataCadastro());
        return cliente;
    }

    public static ClienteRespostaDto toRespostaDto(Cliente cliente) {
        return new ClienteRespostaDto(
                (int) cliente.getId(),
                cliente.getNome(),
                cliente.getEmail(),
                cliente.getTelefone(),
                cliente.getDataCadastro()
        );
    }
}