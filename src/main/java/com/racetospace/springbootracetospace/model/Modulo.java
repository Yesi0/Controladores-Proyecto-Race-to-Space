package com.racetospace.springbootracetospace.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity(name= "modulos")

public class Modulo {
    @Id
    @GeneratedValue
    private Integer modulos_id;
    private String modulos_nombre;
    private Integer modulos_puntaje;
    private String modulos_dificultad; //Principiante, intermedio y avanzado.
}
