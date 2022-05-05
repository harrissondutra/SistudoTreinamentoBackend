package br.com.sistudo.treinamento.repositories;

import br.com.sistudo.treinamento.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}