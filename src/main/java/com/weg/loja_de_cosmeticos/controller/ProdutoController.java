package com.weg.loja_de_cosmeticos.controller;

import com.weg.loja_de_cosmeticos.dto.ProdutoRequisicaoDto;
import com.weg.loja_de_cosmeticos.model.Produto;
import com.weg.loja_de_cosmeticos.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public Produto criar(@RequestBody @Valid ProdutoRequisicaoDto dto) {
        return produtoService.criarProduto(dto);
    }

    @GetMapping
    public List<Produto> listar() {
        return produtoService.listarProdutos();
    }

    @GetMapping("/{id}")
    public Produto buscarPorId(@PathVariable Long id) {
        return produtoService.buscarProdutoPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        produtoService.deletarProduto(id);
    }
}