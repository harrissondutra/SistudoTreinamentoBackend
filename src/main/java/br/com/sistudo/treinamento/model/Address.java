package br.com.sistudo.treinamento.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String street;
    private String address;
    private String city;
    private String state;
    private String postalCode;
}
