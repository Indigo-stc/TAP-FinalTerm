package com.ista.examzuin.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document(collection = "Profesor")
public class Profesor {

    private String nombre;
    private String apellido;
    private String celular;
    private String correo;
    private String direccion;

    private List<Asignatura> asignaturas;

}
