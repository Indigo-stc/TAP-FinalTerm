package com.ista.examzuin.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "Asignatura")
public class Asignatura {

    private String nombre;;
    private Integer nHoras;
    private Integer nHorasPracticas;
    private Integer nHorasAutonomas;



}
