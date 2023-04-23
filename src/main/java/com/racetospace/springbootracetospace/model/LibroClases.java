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
@Entity(name="libroclases")
public class LibroClases {
    @Id
    @GeneratedValue
    private Integer libro_clases_id;
    private Integer libro_clases_calificacion1;
    private Integer libro_clases_calificacion2;
    private Integer libro_clases_calificacion3;
}
