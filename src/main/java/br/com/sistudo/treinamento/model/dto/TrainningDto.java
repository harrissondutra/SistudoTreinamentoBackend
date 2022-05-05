package br.com.sistudo.treinamento.model.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class TrainningDto implements Serializable {
    private final Integer id;
    private final String name;
    private final String description;
    private final String duration;
    private final String registrationDate;
}
