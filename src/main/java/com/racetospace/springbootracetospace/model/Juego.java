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
@Entity(name="juegos")
public class Juego {
    @Id
    @GeneratedValue
    private Integer juegos_id;
    private String juegos_nombre;
    private String juegos_categoria;
    private String juegos_descripcion;
    private Integer modulos_id;
    
}
