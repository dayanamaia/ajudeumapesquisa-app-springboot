package br.com.ajudeumapesquisa.demo.controller;

import br.com.ajudeumapesquisa.demo.model.Pesquisa;
import br.com.ajudeumapesquisa.demo.repository.PesquisaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pesquisa")
public class PesquisaResource {
    @Autowired
    private PesquisaRepository pesquisaRepository;
    @GetMapping
    public List<Pesquisa> listar() {
        return pesquisaRepository.findAll();
    }
    @GetMapping("{codigo}")
    public Pesquisa buscar(@PathVariable int codigo) {
        return pesquisaRepository.findById(codigo).get();
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Pesquisa cadastrar(@RequestBody Pesquisa pesquisa) {
        return pesquisaRepository.save(pesquisa);
    }
    @PutMapping("{id}")
    public Pesquisa atualizar(@RequestBody Pesquisa pesquisa, @PathVariable int id) {
        pesquisa.setCodigo(id);
        return pesquisaRepository.save(pesquisa);
    }
    @DeleteMapping("{codigo}")
    public void remover(@PathVariable int codigo) {
        pesquisaRepository.deleteById(codigo);
    }
    @GetMapping("pesquisa")
    public List<Pesquisa> buscar(@RequestParam(required = false) String nome, @RequestParam(defaultValue = "false") boolean status) {
        return nome != null ? pesquisaRepository.findByNomeAndStatus(nome, status) : pesquisaRepository.findByStatus(status);
    }
}
