package br.com.ajudeumapesquisa.demo.repository;

import br.com.ajudeumapesquisa.demo.model.Pesquisa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PesquisaRepository extends JpaRepository<Pesquisa, Integer> {
    List<Pesquisa> findByNome(String nome);
    List<Pesquisa> findByIdadeMaximaGreaterThan(int idadeMaxima);
    Pesquisa findById(int id);
}
