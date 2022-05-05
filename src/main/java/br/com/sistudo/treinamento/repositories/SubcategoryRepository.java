package br.com.sistudo.treinamento.repositories;

import br.com.sistudo.treinamento.model.Subcategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubcategoryRepository extends JpaRepository<Subcategory, Integer> {
}