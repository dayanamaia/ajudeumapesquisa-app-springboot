package br.com.ajudeumapesquisa.demo.controller;

import br.com.ajudeumapesquisa.demo.model.Pesquisa;
import br.com.ajudeumapesquisa.demo.repository.PesquisaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PesquisaResource {
    @Autowired
    private PesquisaRepository pesquisaRepository;

    @GetMapping("/pesquisas")
    public List<Pesquisa> listarPesquisas() {
        return pesquisaRepository.findAll();
    }

    @GetMapping("/pesquisas/{id}")
    public Pesquisa listarPesquisa(@PathVariable(value="id") int id) {
        return pesquisaRepository.findById(id);
    }

    @PostMapping("/pesquisa")
    public Pesquisa salvarPesquisa(@RequestBody Pesquisa pesquisa) {
        return pesquisaRepository.save(pesquisa);
    }

    @PutMapping("/pesquisa")
    public Pesquisa atualizarPesquisa(@RequestBody Pesquisa pesquisa) {
        return pesquisaRepository.save(pesquisa);
    }

    @DeleteMapping("/pesquisa")
    public void deletarPesquisa(@RequestBody Pesquisa pesquisa) {
        pesquisaRepository.delete(pesquisa);
    }
}
