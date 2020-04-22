package br.com.ajudeumapesquisa.demo.repository;

import br.com.ajudeumapesquisa.demo.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    List<Categoria> findByNome(String cat);
}
