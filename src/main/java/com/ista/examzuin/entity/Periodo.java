package com.ista.examzuin.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "Periodo")
public class Periodo {

    private String nombre;
    private Integer year;

}
