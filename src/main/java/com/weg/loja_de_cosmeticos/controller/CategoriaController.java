package com.weg.loja_de_cosmeticos.controller;

import com.weg.loja_de_cosmeticos.dto.CategoriaRequisicaoDto;
import com.weg.loja_de_cosmeticos.model.Categoria;
import com.weg.loja_de_cosmeticos.service.CategoriaService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @PostMapping
    public Categoria criar(@RequestBody @Valid CategoriaRequisicaoDto dto) {
        return categoriaService.criarCategoria(dto);
    }

    @GetMapping
    public List<Categoria> listar() {
        return categoriaService.listarCategorias();
    }

    @GetMapping("/{id}")
    public Categoria buscarPorId(@PathVariable Long id) {
        return categoriaService.buscarCategoriaPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        categoriaService.deletarCategoria(id);
    }
}