package com.weg.loja_de_cosmeticos.service;


import com.weg.loja_de_cosmeticos.dto.CategoriaRequisicaoDto;
import com.weg.loja_de_cosmeticos.mapper.CategoriaMapper;
import com.weg.loja_de_cosmeticos.model.Categoria;
import com.weg.loja_de_cosmeticos.repository.CategoriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriaService {
    private final CategoriaRepository repository;

    public Categoria criarCategoria(CategoriaRequisicaoDto dto) {
        Categoria categoria = CategoriaMapper.toModel(dto);
        return repository.save(categoria);
    }

    public List<Categoria> listarCategorias() {
        return repository.findAll();
    }

    public Categoria buscarCategoriaPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletarCategoria(Long id) {
        repository.deleteById(id);
    }
}