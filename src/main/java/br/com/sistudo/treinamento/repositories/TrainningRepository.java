package br.com.sistudo.treinamento.repositories;

import br.com.sistudo.treinamento.model.Trainning;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainningRepository extends JpaRepository<Trainning, Integer> {
}