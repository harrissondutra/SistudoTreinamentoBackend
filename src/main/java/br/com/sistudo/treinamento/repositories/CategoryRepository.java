package br.com.sistudo.treinamento.repositories;

import br.com.sistudo.treinamento.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}