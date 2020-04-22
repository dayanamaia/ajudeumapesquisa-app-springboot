package br.com.ajudeumapesquisa.demo.controller;

import br.com.ajudeumapesquisa.demo.model.Categoria;
import br.com.ajudeumapesquisa.demo.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categoria")
public class CategoriaResource {
    @Autowired
    private CategoriaRepository categoriaRepository;
    @GetMapping
    public List<Categoria> listar() {
        return categoriaRepository.findAll();
    }

    @GetMapping("{codigo}")
    public Categoria buscar(@PathVariable int codigo) {
        return categoriaRepository.findById(codigo).get();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Categoria cadastrar(@RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
    @PutMapping("{id}")
    public Categoria atualizar(@RequestBody Categoria categoria, @PathVariable int id) {
        categoria.setCodigo(id);
        return categoriaRepository.save(categoria);
    }

    @DeleteMapping("{codigo}")
    public void remover(@PathVariable int codigo) {
        categoriaRepository.deleteById(codigo);
    }

    @GetMapping("categoria")
    public List<Categoria> buscar(@RequestParam(required = false) String nome) {
        return categoriaRepository.findByNome(nome);
    }
}
