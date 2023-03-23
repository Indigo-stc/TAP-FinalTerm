package com.ista.examzuin.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document(collection = "Carrera")
public class Carrera {

    @Id
    private Long id;
    private String nombre;
    private String descripcion;

    private List<Ciclo> cicloes;

    private Periodo periodo;


}
