package com.weg.loja_de_cosmeticos.service;

import com.weg.loja_de_cosmeticos.dto.ProdutoRequisicaoDto;
import com.weg.loja_de_cosmeticos.mapper.ProdutoMapper;
import com.weg.loja_de_cosmeticos.model.Produto;
import com.weg.loja_de_cosmeticos.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoService {
    private final ProdutoRepository repository;

    public Produto criarProduto(ProdutoRequisicaoDto dto) {
        Produto produto = ProdutoMapper.toModel(dto);
        return repository.save(produto);
    }

    public List<Produto> listarProdutos() {
        return repository.findAll();
    }

    public Produto buscarProdutoPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletarProduto(Long id) {
        repository.deleteById(id);
    }
}