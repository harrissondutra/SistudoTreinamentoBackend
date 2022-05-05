package br.com.sistudo.treinamento.model.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDto implements Serializable {
    private final Integer id;
    private final String name;
    private final String cpf;
    private final String email;
    private final String password;
    private final String registrationDate;
    private final TrainningDto trainning;
}
