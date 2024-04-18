package com.curso.spring.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class Persona {
    private String nombre;
    private  String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;


}
